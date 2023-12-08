package GUVITASK.GTask6.MYSQLJDBC;

/*
I'm not able to copy the data from the link. 
so kindly open this link for viewing the problem statement.
https://docs.google.com/document/d/13SkGN7Sdic1EoYLk1GWjXBU5UzOEQ6WLCo84j7p5pHk/edit

*/

// Employee class representing attributes of an employee
public class Employee {

    private String empname;  // Employee name
    private int empage;      // Employee age
    private int esalary;     // Employee salary

    //Employee parameterized Constructor
    public Employee(String empname, int empage, int esalary) {


        this.empname = empname;
        this.empage = empage;
        this.esalary = esalary;
    }

    // Getter and setter methods for Employee attributes...


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
