//Dynamic arr is created using ArrayList
package Day_9;
import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        System.out.print("Enter the elements : ");
        for(int i =0;i<5;i++)
        {
        list.add(in.nextInt());
        }
        System.out.print("The elements are : ");
        for(int j=0;j<5;j++)
        {
           System.out.print(list.get(j));
        }
    }
}
