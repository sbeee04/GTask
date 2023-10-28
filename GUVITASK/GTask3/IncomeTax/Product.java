package GUVITASK.GTask3.IncomeTax;

public class Product implements Taxable {
    int pid;
    double price,quantity,calcSLTax;

    Product(int pid,double price,double quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public void calcTax() {
        calcSLTax = (salesTax * price)/100;
        System.out.println("Sales Tax For The Product Id:"+pid+
                " is:"+calcSLTax);
    }
}
