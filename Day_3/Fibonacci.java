package Day_3;
import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number till you want : ");
        int n = in.nextInt();
        int a=0;
        int b=1;
        System.out.print("Fibonacci Series is : "+a+" ");
        for(int i=2;i<=n;i++)
        {
            int temp=b;
            b = b+a;
            a = temp;
            System.out.print(b+" ");
        }

    }
}