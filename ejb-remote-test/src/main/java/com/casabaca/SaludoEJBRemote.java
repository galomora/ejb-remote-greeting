package com.casabaca;

import javax.ejb.Remote;

@Remote
public interface SaludoEJBRemote {
	String saludar (String nombre);
}
