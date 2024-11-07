package com.dangabito.projectspringweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.annotation.RequestScope;
import com.dangabito.projectspringweb.services.SpringService;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Named;

/**
 * Controlador de Ejemplo para demostrar la integracón de Spring con JSF
 */
@Named
@RequestScope
public class SpringJSFController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nombreEmpresa;

	// ::::::::::::::::::::CREANDO OBJETO SIN SPRING::::::::::::::::::::::::::::::::
	// SpringService springService= new SpringServicesImpl();

	@Autowired
	private SpringService springServiceImpl;

	public SpringJSFController() {
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void init() {
		String nombre = springServiceImpl.mostrarNombreEmpresa();
		System.out.println(nombre);
		this.nombreEmpresa = nombre;
	}

	/**
	 * @return the springServiceImpl
	 */
	public SpringService getSpringServiceImpl() {
		return springServiceImpl;
	}

	/**
	 * @param springServiceImpl the springServiceImpl to set
	 */
	public void setSpringServiceImpl(SpringService springServiceImpl) {
		this.springServiceImpl = springServiceImpl;
	}

	/**
	 * @return the nombreEmpresa
	 */
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

}
