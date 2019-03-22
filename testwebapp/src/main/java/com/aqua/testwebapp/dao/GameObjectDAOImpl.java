package com.aqua.testwebapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aqua.testwebapp.entity.GameObject;

@Repository
public class GameObjectDAOImpl implements GameObjectDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<GameObject> getGameObjects() {

		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<GameObject> query = currentSession.createQuery("FROM GameObject ORDER BY comments", GameObject.class);
		
		return query.getResultList();
		
		
	}

}
