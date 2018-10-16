package co.sistemausuarios.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "inicioBean")
@SessionScoped
public class InicioBean {
	
	@PostConstruct
	public void init() {
		
	}
}