/*
 * 文 件 名:  ${table.className}Service.java
 * 创 建 人:  tangqian
 * 创建时间:  <#if now??>${now?string('yyyy-MM-dd')}</#if>
 */
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service;

import com.app.base.common.dto.BaseSearchDto;
import com.app.base.common.dto.ServiceResult;
import ${basepackage}.dao.${className};

import com.gv.app.epg.util.page.Pageable;


/**
 * <一句话功能简述>
 */
public interface ${className}Service {
    
    String CODE = "${className?upper_case}";
    
    Pageable<${className}> getList(BaseSearchDto dto);
    
    ServiceResult save(${className} ${shortName});
    
    ServiceResult delete(String ids);
    
    ${className} getById(Integer id);
    
    ${className} view(Integer id);

    ServiceResult update(${className} ${shortName});
}
