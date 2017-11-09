package net.service.manageracc.domain;

import java.sql.SQLException;
import net.service.manageracc.entity.Position;
import net.service.manageracc.service.GenericService;
import net.service.manageracc.util.HibernateUtil;
import org.hibernate.Session;

public class Domain {

    public static void main(String[] args) throws SQLException {

        Position pos ;
        GenericService posService = new GenericService(Position.class);
        pos = (Position) posService.getById(1);
//
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        pos =(Position) session.get(Position.class, 1);
        
        System.out.println(pos.getPosition());
        
        HibernateUtil.shutdown();

    }
}
