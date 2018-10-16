package co.sistemausuarios.ejb.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class BaseEJB {
	
	@Resource(mappedName = "dc_sistemusers")
	protected DataSource dc_sistemusers;
}