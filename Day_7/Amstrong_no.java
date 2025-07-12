//Program to Check the number is amstrong or not
package Day_7;
import java.util.Scanner;

public class Amstrong_no {
    public static void main(String[] args) {
        solve();
    }

    static void solve(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long value = in.nextLong();
        long temp = value;
        long i=0;
        while(value>0){
        long rem = value%10;
        i = i+(rem*rem*rem);        //Calculating cube of each and adding it
        value = value/10;
        }
        if(i==temp)
        {
            System.out.println("The number "+temp+" is an Amstrong number");
        }
        else
        {
            System.out.println("The number "+temp+" is not an Amstrong number");
        }
    }
}
