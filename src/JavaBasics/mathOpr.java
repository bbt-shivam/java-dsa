package JavaBasics;

public class mathOpr {
    public static void main(String[] args) {
        intFunc();
        floatFunc();
        doubleFunc();
    }

    public static void intFunc(){
        int x = 15 , y = 10;

        int sum = x+y;
        int sub = x-y;
        int prd = x*y;
        int div = x/y;
        int mod = x%y;

        System.out.println("sum of " + x + " and " + y + " is " + sum);
        System.out.println("sub of " + x + " and " + y + " is " + sub);
        System.out.println("prd of " + x + " and " + y + " is " + prd);
        System.out.println("div of " + x + " and " + y + " is " + div);
        System.out.println("mod of " + x + " and " + y + " is " + mod);
    }

    public static void floatFunc(){
        float x = 33 , y = 7;

        float sum = x+y;
        float sub = x-y;
        float prd = x*y;
        float div = x/y;
        float mod = x%y;

        System.out.println("---------------- float ----------------");
        System.out.println("sum of " + x + " and " + y + " is " + sum);
        System.out.println("sub of " + x + " and " + y + " is " + sub);
        System.out.println("prd of " + x + " and " + y + " is " + prd);
        System.out.println("div of " + x + " and " + y + " is " + div);
        System.out.println("mod of " + x + " and " + y + " is " + mod);
    }

    public static void doubleFunc(){
        double x = 33.33 , y = 7.1;

        double sum = x+y;
        double sub = x-y;
        double prd = x*y;
        double div = x/y;
        double mod = x%y;

        System.out.println("------------- double -------------------");
        System.out.println("sum of " + x + " and " + y + " is " + sum);
        System.out.println("sub of " + x + " and " + y + " is " + sub);
        System.out.println("prd of " + x + " and " + y + " is " + prd);
        System.out.println("div of " + x + " and " + y + " is " + div);
        System.out.println("mod of " + x + " and " + y + " is " + mod);
    }
}
