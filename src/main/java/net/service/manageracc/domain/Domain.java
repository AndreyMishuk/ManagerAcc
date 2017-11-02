package net.service.manageracc.domain;

import java.sql.SQLException;
import net.service.manageracc.entity.Position;
import net.service.manageracc.service.GenericService;
import net.service.manageracc.util.HibernateUtil;

public class Domain {

    public static void main(String[] args) throws SQLException {

        Position pos = new Position();
        GenericService posService = new GenericService(Position.class);
        
        System.out.println(posService.getById(2));
        
        HibernateUtil.shutdown();

    }
}
