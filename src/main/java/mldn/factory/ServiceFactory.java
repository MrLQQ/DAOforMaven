package mldn.factory;
import mldn.service.IEmpService;
import mldn.service.impl.EmpServiceImpl;

public class ServiceFactory {
    public static IEmpService getIEmpServiceInstance(){
        return new EmpServiceImpl();
    }
}
