
package net.service.manageracc.service;

import java.sql.SQLException;
import java.util.List;
import net.service.manageracc.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import net.service.manageracc.dao.IGenericDao;

public class GenericService<T> implements IGenericDao<T>{

    private final Class<T> type;
    
    public GenericService(Class<T> type) {
        this.type = type;
    }
    
    @Override
    public void add(T entity) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(entity);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if(session != null && session.isOpen())
                session.close();
        }
    }

    @Override
    public void update(T entity) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(entity);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if(session != null && session.isOpen())
                session.close();
        }
    }

    @Override
    public void remove(T entity) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(entity);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if(session != null && session.isOpen())
                session.close();
        }
    }

    @Override
    public T getById(int id) throws SQLException {
        Session session = null;
        T value = null;
        
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            value = session.get(type, id);
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if(session != null && session.isOpen())
                session.close();
        }
        
        return value;
    }

    @Override
    public List<T> getAll() throws SQLException {
        Session session = null;
        List<T> value = null;
        
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            value = session.createCriteria(type).list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            if(session != null && session.isOpen())
                session.close();
        }
        
        return value;
    }
    

    
}
