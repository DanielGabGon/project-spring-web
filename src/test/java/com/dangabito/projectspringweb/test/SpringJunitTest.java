package com.dangabito.projectspringweb.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import com.dangabito.projectspringweb.services.SpringService;

/**
 * @author dangabito
 * Clase de Prueba Unitaria con Spring y JUNIT.
 * 
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"} )
class SpringJunitTest {

	@Autowired
	private SpringService springServiceImpl;
	
	@Test
	void test() {		
	System.out.println(this.springServiceImpl.mostrarNombreEmpleado());
	}

}
