//To check the number is prime or not
package Day_6;
import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int num = in.nextInt();
        boolean IsPrime=true;
        if(num<=1)
        {
            System.out.println("The number "+num+" not a Prime Number");
        }
        else{
        for(int i=2;i<num;i++)            //Loop to check
        {
            if(num%i==0)
            {
                IsPrime = false;
            }
        }
        if(IsPrime==false)
        {
            System.out.println("The number "+num+" not a Prime Number");
        }
        else
        {
            System.out.println("The number "+num+" a Prime Number");

        }
    }
    }    
}
