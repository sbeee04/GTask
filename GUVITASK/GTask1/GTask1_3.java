package GUVITASK.GTask1;

public class GTask1_3 {
    // method to rev num
    public long reversDigits(long num)
    {

        // converting number to string
        String str = String.valueOf(num);

        // reversing the string
        str = new StringBuilder(str).reverse().toString();

        // converting string to integer
        num = Integer.valueOf(str);

        // returning integer
        return num;
    }
}
