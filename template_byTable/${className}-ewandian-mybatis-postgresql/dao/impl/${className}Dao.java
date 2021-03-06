<#include "/java_copyright.include">
<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
package ${basepackage}.dao.impl;

import com.ewandian.b2b.common.dao.impl.BaseDAO;
import ${basepackage}.dao.I${className}Dao;
<#include "/java_imports.include">

/**
 * ${className}的Dao层实现
 *
 * @author Tian
 * @date ${now?string("yyyy-MM-dd")}
 * @version 1.0
 */
//@Repository
public class ${className}Dao extends ${namespace?cap_first}CommonDAO<${className}Vo> implements I${className?cap_first}Dao {
}
