/**
 * 
 */
package com.dangabito.projectspringweb.dao.impl;

import org.springframework.stereotype.Repository;

import com.dangabito.projectspringweb.dao.EmpleadoDAO;

/**
 * 
 */
@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO{

	/**
	 * 
	 */
	public EmpleadoDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mostrarNombreEmpleado() {
		return "Bienvenido Janitzio" ;
	}

}
