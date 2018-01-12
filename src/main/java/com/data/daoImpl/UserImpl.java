package com.data.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.data.dao.BaseDao;

@Repository
public class UserImpl implements BaseDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public <T> List<T> selectAllByType(String sql, Class<T> clazz) {
		TypedQuery<T> query = em.createQuery(sql, clazz);
		List<T> list = query.getResultList();
		return list;
	}

	
}
