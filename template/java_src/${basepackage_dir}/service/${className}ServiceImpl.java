<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.yeahka.common.core.service.CrudService;
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
		// To rewrite
	}
    
}
