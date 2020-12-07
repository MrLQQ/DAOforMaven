package mldn.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Emp implements Serializable{
    private Integer empno;
    private String ename;
    private String job;
    private Date hiredate;
    private Double sal;
    private Double  comm;

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(empno, emp.empno) && Objects.equals(ename, emp.ename) && Objects.equals(job, emp.job) && Objects.equals(hiredate, emp.hiredate) && Objects.equals(sal, emp.sal) && Objects.equals(comm, emp.comm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, ename, job, hiredate, sal, comm);
    }

    @Override
    public String toString() {
        return "{\"Emp\":{"
                + "\"empno\":"
                + empno
                + ",\"ename\":\""
                + ename + '\"'
                + ",\"job\":\""
                + job + '\"'
                + ",\"hiredate\":\""
                + hiredate + '\"'
                + ",\"sal\":"
                + sal
                + ",\"comm\":"
                + comm
                + "}}";

    }


}


