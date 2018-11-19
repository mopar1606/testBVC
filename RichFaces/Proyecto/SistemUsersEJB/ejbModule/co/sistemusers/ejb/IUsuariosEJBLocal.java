/**
 * 
 */
package co.sistemusers.ejb;

import javax.ejb.Local;

import co.sistemusers.dto.UsuarioDTO;

/**
 * @author DEVELOP
 *
 */
@Local
public interface IUsuariosEJBLocal {
	
	public Integer createUser(UsuarioDTO usuario) throws Exception;
}
