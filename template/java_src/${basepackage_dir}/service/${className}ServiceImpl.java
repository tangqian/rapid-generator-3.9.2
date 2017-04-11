<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ofweek.live.core.common.utils.StringUtils;
import com.ofweek.live.core.common.service.CrudService;
import com.ofweek.live.core.modules.sys.utils.SequenceUtils;

import ${basepackage}.dao.${className}Dao;
import ${basepackage}.entity.${className};

/**
 * 
 * @author tangqian
 */
@Service
@Transactional(readOnly = true)
public class ${className}ServiceImpl extends CrudService<${className}Dao, ${className}> {
	
	@Override
	@Transactional(readOnly = false)
	public void save(${className} entity) {
		if (StringUtils.isBlank(entity.getId())){
			entity.setId(SequenceUtils.getNextString("${className}"));
			entity.preInsert();
			dao.insert(entity);
		}else{
			entity.preUpdate();
			dao.update(entity);
		}
	}
    
}
