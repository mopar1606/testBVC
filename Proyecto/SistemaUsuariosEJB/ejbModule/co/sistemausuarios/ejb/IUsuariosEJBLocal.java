package co.sistemausuarios.ejb;

import javax.ejb.Local;

import co.sistemausuarios.dto.UsuarioDTO;

@Local
public interface IUsuariosEJBLocal {
	
	public Integer createUser(UsuarioDTO usuario) throws Exception;
}