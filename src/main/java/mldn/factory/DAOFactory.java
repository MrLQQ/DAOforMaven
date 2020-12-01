package mldn.factory;

import mldn.dao.EmpDAO;
import mldn.impl.EmpDAOImpl;

import java.sql.Connection;

public class DAOFactory {
    public static EmpDAO getIEmpDAOInstance(Connection conn){
        return new EmpDAOImpl(conn);
    }
}
