package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl2", AutorDAO.class);
		
		///CRUD ; CREATE; READ; UPDATE; DELETE
		
		//ADD
		Autor autor =new Autor(0,"juan","taipe","Alemania","098563214","jbcgdf@taipe.com", "av.por ahí");
		//autorDAO.add(autor);
		
		//UP
		Autor autor2 =new Autor(55,"juan2","taipe2","Alemania2","0985632142","jbcgdf@taipe2.com", "av.por ahí2");
		//autorDAO.up(autor2);
		
		//DEL
		autorDAO.del(55);
		//FINDONE
		try{ System.out.println("********************DEL**************"+autorDAO.findOne(55));} catch (Exception e) {e.printStackTrace();};
		//FINDALL
		//List<Autor> autores =autorDAO.findAll();
		autorDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		
	
		
		context.close();

	}

}
