/**
 * 
 */
package co.sistemusers.ejb.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author DEVELOP
 *
 */
public class BaseEJB {
	
	@Resource(mappedName = "dc_sistemusers")
	protected DataSource dc_sistemusers;
}