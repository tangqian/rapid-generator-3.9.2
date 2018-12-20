<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.service;

import org.springframework.stereotype.Service;

import ${basepackage}.dao.${className}Dao;
import ${basepackage}.entity.${className};
import com.vivo.browsersearch.service.common.CrudService;

/**
 * 
 * @author tangqian
 */
@Service
public class ${className}ServiceImpl extends CrudService<${className}Dao, ${className}> {

    @Override
    public void save(${className} entity){

    }
    
}
