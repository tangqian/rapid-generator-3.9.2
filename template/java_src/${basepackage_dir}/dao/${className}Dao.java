<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.dao;

import ${basepackage}.entity.${className};
import com.vivo.browsersearch.dal.common.CrudDao;

public interface ${className}Dao extends CrudDao<${className}> {
	
}