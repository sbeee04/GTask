package GUVITASK.GTask3.IncomeTax;

public class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    double calcInTax;

    Employee(int empId,String name,double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        calcInTax = (incomeTax * salary)/100;
        System.out.println("\"Income Tax For The Employee:"+empId+" " +
                "is:"+calcInTax);
    }
}
