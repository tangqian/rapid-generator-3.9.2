<#include "/macro.include"/>
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.entity;

import com.yeahka.common.core.persistence.BaseEntity;
import java.util.Date;

public class ${className} extends BaseEntity<${className}> {

	private static final long serialVersionUID = 1L;
	<#list table.columns as column>
	<@generateBycondition column.sqlName>
	
	private ${column.simpleJavaType} ${column.columnName};
	</@generateBycondition>
	</#list>

<@generateJavaColumns/>
}
<#macro generateJavaColumns>
	<#list table.columns as column>
    <@generateBycondition column.sqlName>
	public void set${column.columnName}(${column.simpleJavaType} value) {
		this.${column.columnName} = value;
	}
	
	public ${column.simpleJavaType} get${column.columnName}() {
		return this.${column.columnName};
	}
	
	</@generateBycondition>
	</#list>
</#macro>