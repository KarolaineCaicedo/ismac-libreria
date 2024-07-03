package com.distribuida.principal;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDAO facturaDAO = context.getBean("facturaDAOImplementation", FacturaDAO.class);
		ClienteDAO clienteDAO = context.getBean("clienteDAOImplementation", ClienteDAO.class);
		
		///CRUD ; CREATE; READ; UPDATE; DELETE
		
		//ADD
		Factura factura = new Factura(0,"FAC-0090", new Date(), 66.63, 15.36, 76.35);
		factura.setCliente(clienteDAO.findOne(1));
		//facturaDAO.add(factura);
		
		//UP
		Factura factura2 = new Factura(86,"FAC-0091", new Date(), 62.62, 12.32, 72.32);
		factura2.setCliente(clienteDAO.findOne(2));
		//facturaDAO.up(factura2);
		
		//DEL
		facturaDAO.del(86);
		
		//FINDONE
		System.out.println("********************DEL*********" + facturaDAO.findOne(86));
		
		
		//FINDALL
		facturaDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		
	
		
		context.close();

	}

}


