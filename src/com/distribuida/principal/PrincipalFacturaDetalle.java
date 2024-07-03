package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.entities.FacturaDetalle;

public class PrincipalFacturaDetalle  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FacturaDetalle facturadetalleDAO = (FacturaDetalle) context.getBean("facturadetalleDaoImpl" , FacturaDetalleDAO.class);
		FacturaDetalle facturadetalle= new FacturaDetalle (0,"123456789","juan","taipe","av. por ahi..","0987654321","jtaipe@correo.com");
		((FacturaDetalleDAO) facturadetalleDAO).add(facturadetalle);
		FacturaDetalle facturadetalle2= new FacturaDetalle(1,"12784789","Anto","torres","av.Tasipe","0989755216","Antod@correo.com");
		((FacturaDetalleDAO) facturadetalleDAO).up(facturadetalle2);
		//facturadetalleDao.del(1);
		System.out.println("******************* DEL *******************"+((FacturaDetalleDAO) facturadetalleDAO).findOne(1));
		((FacturaDetalleDAO) facturadetalleDAO).findAll().forEach(item -> {System.out.println(item.toString());});
		//List<FacturaDetalle> facturadetalles= facturadetalleDAO.findAll();
		//clientes.forEach(item -> {
			//System.out.println(item.toString());

 
		
		context.close();
	}
}
