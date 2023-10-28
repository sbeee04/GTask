package GUVITASK.GTask1;

public class GTask1_4 {
    public int findbig(int a, int b, int c) {
        if (a <= b && a <= c)
            return a;

        else if (b <= a && b <= c)
            return b;

        return c;

    }
}



