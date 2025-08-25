//Revised the function using parameter to find factorial
package Day_12;
import java.util.Scanner;

public class Quick_revise_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no. to find factorial : ");
        int n = in.nextInt();
        System.out.print("The Factorial of "+n+" is : "+factorial(n));
    }

    static int factorial(int x){
        int fact=1;
        for(int i=2;i<=x;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
