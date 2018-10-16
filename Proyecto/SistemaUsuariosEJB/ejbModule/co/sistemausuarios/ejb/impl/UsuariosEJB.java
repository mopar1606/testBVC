package co.sistemausuarios.ejb.impl;

import javax.ejb.Stateless;

import org.apache.log4j.Logger;

import co.sistemausuarios.dao.UsuariosDAO;
import co.sistemausuarios.dto.UsuarioDTO;
import co.sistemausuarios.ejb.IUsuariosEJBLocal;

@Stateless
public class UsuariosEJB extends BaseEJB implements IUsuariosEJBLocal{

	private Logger logger = Logger.getLogger(UsuariosEJB.class);
	
	@Override
	public Integer createUser(UsuarioDTO usuario) throws Exception {
		logger.info("Clase: UsuariosEJB Función: createUser");
		UsuariosDAO usuarioDAO = new UsuariosDAO(dc_sistemusers);
		return usuarioDAO.createUser(usuario);
	}
}