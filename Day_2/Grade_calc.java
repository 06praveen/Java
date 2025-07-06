package Day_2;
import java.util.Scanner;

public class Grade_calc{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Percentage : ");
        float percent = in.nextFloat();
        if(percent >= 75)
        {
            System.out.println("You have Passed with Distinction Grade");
        }
        else if(percent<75 && percent>=60)
        {
            System.out.println("You have Passed with I Class Grade");
        }
        else if(percent<60 && percent>=50)
        {
            System.out.println("You have Passed with II Class Grade");
        }
        else if(percent<50 && percent>=35)
        {
            System.out.println("You are Pass");
        }
        else
        {
            System.out.println("You are Fail!");
        }
    }
}