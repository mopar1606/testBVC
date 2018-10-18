/**
 * 
 */
package co.sistemusers.ejb.impl;

import javax.ejb.Stateless;

//import org.apache.log4j.Logger;

import co.sistemusers.dao.UsuariosDAO;
import co.sistemusers.dto.UsuarioDTO;
import co.sistemusers.ejb.IUsuariosEJBLocal;

/**
 * @author DEVELOP
 *
 */
@Stateless
public class UsuariosEJB extends BaseEJB implements IUsuariosEJBLocal{

//	private Logger logger = Logger.getLogger(UsuariosEJB.class);
	
	public Integer createUser(UsuarioDTO usuario) throws Exception {
//		logger.info("Clase: UsuariosEJB Función: createUser");
		UsuariosDAO usuarioDAO = new UsuariosDAO(dc_sistemusers);
		return usuarioDAO.createUser(usuario);
	}
}