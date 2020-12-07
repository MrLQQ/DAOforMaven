package mldn.test;


import mldn.factory.ServiceFactory;
import mldn.pojo.Emp;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args){
        String []first_name={"赵","钱","孙","李","周","吴","郑","王"};
        String []last_name={"老大","老二","老三","老四","老五"};


        for (int i=0;i<100;i++){
            int empno=new Random().nextInt(1000);
            Emp emp=new Emp();
            emp.setEname(first_name[new Random().nextInt(8)]+last_name[new Random().nextInt(5)]);
            emp.setEmpno(empno);
            emp.setJob("职工"+empno);
            emp.setHiredate(new Date());
            emp.setSal(2000.0);
            emp.setComm(200.0);
            try {
                ServiceFactory.getIEmpServiceInstance().insert(emp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }



//        Set<Integer> ids=new HashSet<Integer>();
//        ids.add(17);
//        ServiceFactory.getIEmpServiceInstance().delete(ids);

        try {
            List<Emp>list=ServiceFactory.getIEmpServiceInstance().list();
            for (Emp emp:list){

                System.out.print(emp.toString()+"\n");
            }
        }catch (Exception ignored){

        }
    }

}
