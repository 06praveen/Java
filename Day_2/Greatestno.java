//To Find the Greatest no. among 3 no.'s
package Day_2;
import java.util.Scanner;

public class Greatestno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 3  no.'s : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        if(a>b && a>c){
            System.out.println("a = " + a + " is Greatest among 3 no.'s");
        }
        else if(b>a && b>c){
            System.out.println("b = " + b + " is Greatest among 3 no.'s");
        }
        else{
            System.out.println("c = " + c + " is Greatest among 3 no.'s");
        }
    }
}
