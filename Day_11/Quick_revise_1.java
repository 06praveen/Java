package Day_11;
import java.util.Scanner;

public class Quick_revise_1{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the no. to generate Table :  ");
    int n = in.nextInt();
    for(int i=1;i<=10;i++)
      {
        System.out.println(n+" x "+i+" = "+(n*i));
      }
  }
}
