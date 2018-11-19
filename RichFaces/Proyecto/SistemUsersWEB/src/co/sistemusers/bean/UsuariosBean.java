/**
 * 
 */
package co.sistemusers.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author DEVELOP
 *
 */
@ManagedBean(name = "usuariosBean")
@ViewScoped
public class UsuariosBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PostConstruct
	public void init(){
		
	}
	
	public void loadNewUser(){
	}
}