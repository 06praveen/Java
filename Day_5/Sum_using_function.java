package Day_5;
import java.util.Scanner;

public class Sum_using_function{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int result = sum();                  //Here value of sum function is stored in result
    System.out.print("The sum is : " + result);    //Result is Display
  }

  static int sum(){
    System.out.print("Enter the two no. : ");
    int a = in.nextInt();
    int b = in.nextInt();
    sum = a+b;
    return sum;    //Here the value of sum is return to main function
  }
}
