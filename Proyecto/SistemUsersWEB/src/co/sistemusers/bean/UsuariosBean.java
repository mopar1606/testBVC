/**
 * 
 */
package co.sistemusers.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;

import co.sistemusers.dto.UsuarioDTO;
import co.sistemusers.ejb.IUsuariosEJBLocal;

/**
 * @author DEVELOP
 *
 */
public class UsuariosBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre, apellidos, nacionalidad, email, telefono, observacion, identificacion;
	
	@EJB
	private IUsuariosEJBLocal usuariosEJB;
	
	@PostConstruct
	public void init(){
	}
	
	/**
	 * Registrar Nuevo Usuario
	 * @throws Exception 
	 */
	public void saveUser() throws Exception{
		UsuarioDTO usuario = new UsuarioDTO();
		usuario.setNombre(nombre);
		usuario.setApellidos(apellidos);
		usuario.setNacionalidad(nacionalidad);
		usuario.setEmail(email);
		usuario.setTelefono(telefono);
		usuario.setObservacion(observacion);
		usuario.setIdentificacion(identificacion);
		
		usuariosEJB.createUser(usuario);
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the observacion
	 */
	public String getObservacion() {
		return observacion;
	}

	/**
	 * @param observacion the observacion to set
	 */
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}

	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
}