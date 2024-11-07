/**
 * 
 */
package com.dangabito.projectspringweb.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dangabito.projectspringweb.dao.EmpleadoDAO;
import com.dangabito.projectspringweb.services.SpringService;

/**
 * 
 */
@Service
public class SpringServicesImpl implements SpringService {
	
	@Autowired
	private EmpleadoDAO empleadoDAOImpl;

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

	@Override
	public String mostrarNombreEmpleado() {
		// TODO Auto-generated method stub
		return empleadoDAOImpl.mostrarNombreEmpleado();
	}

}
