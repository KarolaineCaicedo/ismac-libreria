package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Bodega;



@Repository
public class BodegaDAOImpl implements BodegaDAO {

	@Autowired
	private SessionFactory  sessionFactory ;
	
	
	@Override
	@Transactional
	public List<Bodega> findAll() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Bodega", Bodega.class).getResultList();
	}

	@Override
	public Bodega findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Bodega bodega) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Bodega bodega) {
		// TODO Auto-generated method stub
		
	}

}