package Day_6;

public class Overloading_sum {            //Overloading function having same function name
    public static void main(String[] args) {
       sum(18,7);
       sum(10,18,7); 
    }

    static void sum(int a,int b)
    {
        int sum = a+b;
        System.out.println("The sum a+b = "+sum);
    }

    static void sum(int a,int b,int c)
    {
        int sum = a+b+c;
        System.out.println("The sum a+b+c = "+sum);
    }
}
