/*
 * 文 件 名:  ${table.className}Controller.java
 * 创 建 人:  tangqian
 * 创建时间:  <#if now??>${now?string('yyyy-MM-dd')}</#if>
 */
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.base.common.dto.BaseSearchDto;
import com.app.base.common.dto.DwzJsonResponse;
import com.app.base.common.dto.ServiceResult;
import com.app.base.common.dto.DwzJsonResponse.CallbackTypeEnum;
import com.app.base.common.web.BaseController;
import ${basepackage}.dao.${className};
import ${basepackage}.service.${className}Service;

@Controller
@RequestMapping("/${shortName}")
public class ${className}Controller extends BaseController {
    
    private static final String LIST = "${shortName}/${shortName}_list";
    
    private static final String ADD = "${shortName}/${shortName}_add";
    
    private static final String EDIT = "${shortName}/${shortName}_edit";
    
    private static final String VIEW = "${shortName}/${shortName}_view";
    
    @Resource
    private ${className}Service ${classNameLower}Service;
    
    @RequestMapping("/list")
    public ModelAndView list(HttpServletRequest request) {
        BaseSearchDto dto = new BaseSearchDto(request);
        ModelAndView mav = getModelAndView(dto, LIST);
        mav.addObject("page", ${classNameLower}Service.getList(dto));
        return mav;
    }
    
    @RequestMapping("/bfAdd")
    public ModelAndView bfAdd() {
        return getModelAndView(ADD);
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody DwzJsonResponse add(${className} ${classNameLower}) {
        ServiceResult result = ${classNameLower}Service.save(${classNameLower});
        return getDefaultJsonResponse(result);
    }
    
    @RequestMapping("/bfEdit")
    public ModelAndView bfEdit(Integer id){
        ModelAndView mav = getModelAndView(EDIT);
        mav.addObject("${shortName}", ${classNameLower}Service.getById(id));
        return mav;
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public @ResponseBody DwzJsonResponse edit(${className} ${classNameLower}) {
        ServiceResult result = ${classNameLower}Service.update(${classNameLower});
        return getDefaultJsonResponse(result);
    }
    
    @RequestMapping("/view")
    public ModelAndView view(Integer id){
        ModelAndView mav = getModelAndView(VIEW);
        mav.addObject("${shortName}", ${classNameLower}Service.view(id));
        return mav;
    }
    
    @RequestMapping("/delete")
    public @ResponseBody DwzJsonResponse delete(String ids) {
        ServiceResult result = ${classNameLower}Service.delete(ids);
        return getDefaultJsonResponse(result).setCallbackType(CallbackTypeEnum.NOTHING);
    }
}
