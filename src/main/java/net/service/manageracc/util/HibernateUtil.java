
package net.service.manageracc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    
    private static SessionFactory sessionFactory;
    
    private HibernateUtil() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
