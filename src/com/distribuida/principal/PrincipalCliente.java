package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImplementation", ClienteDAO.class);
		
		///CRUD ; CREATE; READ; UPDATE; DELETE
		
		//ADD
		Cliente cliente =new Cliente(0,"123456789","juan","taipe","av.por ahí","098563214","jbcgdf@taipe.com");
		ClienteDAO.add(cliente);
		
		//UP
		Cliente cliente2 =new Cliente(39,"1234568752", "tefy","carrión","derecha","03652894","t@gmail.com");
		ClienteDAO.up(cliente2);
		
		//DEL
		ClienteDAO.del(39);
		//FINDONE
		System.out.println("********************DEL**************"+clienteDAO.findOne(1));
		//FINDALL
		//List<Cliente> clientes =clienteDAO.findAll();
		clienteDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		
	
		
		context.close();

	}

}
