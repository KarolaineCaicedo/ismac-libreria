package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.BodegaDAO;
import com.distribuida.entities.Bodega;



public class PrincipalBodega  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		BodegaDAO bodegaDAO = context.getBean("bodegaDAOImpl", BodegaDAO.class);
		List<Bodega> bodegas = bodegaDAO.findAll();
		
		bodegas.forEach(item -> {
			
			System.out.println(item.toString());
	
		});
		
		context.close();

	}

}
