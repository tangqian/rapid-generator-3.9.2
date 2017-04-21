<#assign className = table.className>   
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.dao;

import com.yeahka.common.core.persistence.CrudDao;
import org.apache.ibatis.annotations.Mapper;
import ${basepackage}.entity.${className};

@Mapper
public interface ${className}Dao extends CrudDao<${className}> {
	
}