/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.service.manageracc.dao;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author andrey
 * @param <T>
 */
public interface IGenericDao<T> {
    
    public void add(T entity) throws SQLException;
    
    public void update(T entity) throws SQLException;
    
    public void remove(T entity) throws SQLException;
    
    public T getById(int id) throws SQLException;
    public List<T> getAll() throws SQLException;
 
    
}
