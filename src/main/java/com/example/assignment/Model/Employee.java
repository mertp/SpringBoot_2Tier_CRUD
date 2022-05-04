package com.example.assignment.Model;

//Implementing necessary fields to the class
public class Employee {
    private int empno;
    private String name;
    private String job;
    private String mgr;
    private String hireDate;
    private int salary;
    private String comm;
    private int deptno;


    //Constructors and getter setter methods.
    public Employee(int empno, String name, String job, String mgr, String hireDate, int salary, String comm, int deptno) {
        this.empno = empno;
        this.name = name;
        this.job = job;
        this.mgr = mgr;
        this.hireDate = hireDate;
        this.salary = salary;
        this.comm = comm;
        this.deptno = deptno;
    }
    public Employee (){

    }
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMgr() {
        return mgr;
    }

    public void setMgr(String mgr) {
        this.mgr = mgr;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empno=" + empno +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", comm=" + comm +
                ", deptno=" + deptno +
                '}';
    }
}
