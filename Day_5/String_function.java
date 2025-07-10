package Day_5;
import java.util.Scanner;

public class String_function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String naam = in.next();
        name(naam);
    }

    static String name(String msg){
        System.out.print("Hello, "+msg);
        return msg;
    }
}
