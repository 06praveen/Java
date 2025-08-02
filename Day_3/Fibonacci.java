package Day_3;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the nth term number : ");
        int n = in.nextInt();
        int a=0,b=1;
        int temp;
        System.out.print("Fibonacci Series is : "+a+" "+b+" ");
        for(int i=2;i<=n;i++)
        {
            temp=b;
            b = b+a;
            a = temp;
            System.out.print(b+" ");
        }

    }

}
