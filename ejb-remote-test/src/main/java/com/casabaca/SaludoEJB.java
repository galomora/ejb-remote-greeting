package com.casabaca;

import javax.ejb.Stateless;

@Stateless
public class SaludoEJB implements SaludoEJBRemote {

	@Override
	public String saludar(String nombre) {
		return "Hello " + nombre;
	}
	
}
