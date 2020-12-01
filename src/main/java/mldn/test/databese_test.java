package mldn.test;
import mldn.factory.ServiceFactory;
import mldn.vojo.Emp;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class databese_test {
    public static void main(String[] args){
        for (int i=0;i<100;i++){
            int empno=new Random().nextInt(1000);
            Emp vo=new Emp();
            vo.setEname("lqq"+empno);
            vo.setEmpno(empno);
            vo.setJob("职工"+empno);
            vo.setHiredate(new Date());
            vo.setSal(1000.0);
            vo.setComm(200.0);
            try {
                ServiceFactory.getIEmpServiceInstance().insert(vo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



//        Set<Integer> ids=new HashSet<Integer>();
//        ids.add(2);
//        ServiceFactory.getIEmpServiceInstance().delete(ids);

        try {
            List<Emp> list=ServiceFactory.getIEmpServiceInstance().list();
            for (Emp emp:list){
                System.out.println(emp.getEmpno());
                System.out.println(emp.getEname());
                System.out.println(emp.getHiredate());
                System.out.println(emp.getComm());
                System.out.println(emp.getJob());
                System.out.println(emp.getSal());
            }
        }catch (Exception ignored){

        }
    }

}
