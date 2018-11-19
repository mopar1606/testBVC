/**
 * 
 */
package co.sistemusers.dto;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author DEVELOP
 *
 */
public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nombre, apellidos, nacionalidad, email, telefono, observacion, identificacion;
	private Timestamp fechacrea, fechamod;
	private Integer estado, idusario, idtipoidentificacion, usuariocreacion;
	
	public UsuarioDTO() {}

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
	 * @return the fechacrea
	 */
	public Timestamp getFechacrea() {
		return fechacrea;
	}

	/**
	 * @param fechacrea the fechacrea to set
	 */
	public void setFechacrea(Timestamp fechacrea) {
		this.fechacrea = fechacrea;
	}

	/**
	 * @return the fechamod
	 */
	public Timestamp getFechamod() {
		return fechamod;
	}

	/**
	 * @param fechamod the fechamod to set
	 */
	public void setFechamod(Timestamp fechamod) {
		this.fechamod = fechamod;
	}

	/**
	 * @return the estado
	 */
	public Integer getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	/**
	 * @return the idusario
	 */
	public Integer getIdusario() {
		return idusario;
	}

	/**
	 * @param idusario the idusario to set
	 */
	public void setIdusario(Integer idusario) {
		this.idusario = idusario;
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
	 * @return the idtipoidentificacion
	 */
	public Integer getIdtipoidentificacion() {
		return idtipoidentificacion;
	}

	/**
	 * @param idtipoidentificacion the idtipoidentificacion to set
	 */
	public void setIdtipoidentificacion(Integer idtipoidentificacion) {
		this.idtipoidentificacion = idtipoidentificacion;
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

	/**
	 * @return the usuariocreacion
	 */
	public Integer getUsuariocreacion() {
		return usuariocreacion;
	}

	/**
	 * @param usuariocreacion the usuariocreacion to set
	 */
	public void setUsuariocreacion(Integer usuariocreacion) {
		this.usuariocreacion = usuariocreacion;
	}
}