//Created a Basic Calculator using if-else & loop.
package Day_3;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result;
        while(true){
        System.out.print("/nEnter the two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.print("Operations :- \n1.Add \n2.Subtract \n3.Multiply \n4.Divide \n5.Modulus " + //
                        "\n6.Exit \n : ");
        int n = in.nextInt();
        if(n==1)
        {
            result=num1+num2;
            System.out.print("Add of two numbers is : "+result);
        }
        else if(n==2)
        {
            result=num1-num2;
            System.out.print("Subtract of two numbers is : "+result);
        }
        else if(n==3)
        {
            result=num1*num2;
            System.out.print("Multiply of two numbers is : "+result);
        }
        else if(n==4)
        {
            if(num2==0)
            {
                System.err.print("Number cannot be divide by Zero!");
            }
            else
            {
                result=num1/num2;
                System.out.print("Divide of two numbers is : "+result);
            }
        }
        else if(n==5)
        {
            result=num1%num2;
            System.out.print("Modulus of two numbers is : "+result);
        }
        else if(n==6)
        {
            System.out.print("Exiting...");
            break;
        }
        else
        {
            System.out.print("Inavlid Input! Try Again.");
        }
    }
    }
}
