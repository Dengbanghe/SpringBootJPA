package com.data.dao;

import java.util.List;


public interface BaseDao {
	public <T>List<T> selectAllByType(String sql,Class<T> clazz);
}
