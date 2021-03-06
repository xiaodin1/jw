package com.jw.db;

import java.sql.Connection;

/**
 * 
 * @author Jay Zhang
 * 
 */
public interface JwCallable<T> {
	public T call(Connection connection) throws Exception;
}
