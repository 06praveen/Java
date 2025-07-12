package Day_7;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = in.nextInt();
        System.out.println("The Factorial of "+num+"! = "+factorial_cal(num));
    }

    static int factorial_cal(int n)
    {
        int result=1;
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
        for(int i=n;i>=2;i--)
        {
            result=result*i;
        }
        return result;
    }
    }
}
