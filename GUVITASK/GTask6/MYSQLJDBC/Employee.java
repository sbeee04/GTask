package GUVITASK.GTask6.MYSQLJDBC;

// Employee class representing attributes of an employee
public class Employee {
    //private int empcode;// Employee code
    private String empname;  // Employee name
    private int empage;      // Employee age
    private int esalary;     // Employee salary

    //Employee parameterized Constructor
    public Employee(String empname, int empage, int esalary) {

       // this.empcode=empcode;
        this.empname = empname;
        this.empage = empage;
        this.esalary = esalary;
    }

    // Getter and setter methods for Employee attributes...
    /*
    public int getEmpcode() {

        return empcode;
    }

    public void setEmpcode(int empcode) {
        this.empcode = empcode;
    }

     */

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public int getEsalary() {
        return esalary;
    }

    public void setEsalary(int esalary) {
        this.esalary = esalary;
    }
}
