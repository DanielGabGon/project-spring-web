/**
 * 
 */
package com.dangabito.projectspringweb.services.impl;

import org.springframework.stereotype.Service;

import com.dangabito.projectspringweb.services.SpringService;

/**
 * 
 */
@Service
public class SpringServicesImpl implements SpringService {

	/**
	 * 
	 */
	public SpringServicesImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mostrarNombreEmpresa() {
		return "Anotaciones con spring y JSF";
	}

}
