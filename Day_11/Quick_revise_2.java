package Day_11;
import java.util.Scanner;

public class Quick_revise_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. till Fibonacci series : ");
        int n = in.nextInt();
        int a=0;
        int b=1;
        if(n<=0)
        {System.out.println("Please enter Positive number.");}
        else if(n==1)
        {System.out.println("The Fibonacci Series is : "+b);}
        else
        {
            System.out.print("The Fibonacci Series is : "+a+" "+b+" ");
            for(int i=2;i<n;i++)
            {
                int temp = a;
                a=b;
                b=b+temp;
                System.out.print(" "+b+" ");
            }
        }  
    }
}
