package Day_7;
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+i*num);
        }
    }    
}
