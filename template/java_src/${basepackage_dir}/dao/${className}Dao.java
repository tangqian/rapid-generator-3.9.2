<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.dao;

import com.ofweek.live.core.common.persistence.CrudDao;
import com.ofweek.live.core.common.persistence.annotation.MyBatisDao;
import ${basepackage}.entity.${className};

/**
 * 
 * @author tangqian
 */
@MyBatisDao
public interface ${className}Dao extends CrudDao<${className}> {
	
}