<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.dao;

import com.yeahka.common.core.persistence.CrudDao;
import com.yeahka.common.core.persistence.MyBatisDao;
import ${basepackage}.entity.${className};

@MyBatisDao
public interface ${className}Dao extends CrudDao<${className}> {
	
}