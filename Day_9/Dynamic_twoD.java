//Here Two Dimensional array is created using ArrayList
package Day_9;
import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic_twoD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> twoD = new ArrayList<>();
        
        System.out.print("Enter the elements : ");
        for(int i=0;i<3;i++)
        {
            twoD.add( new ArrayList<>(i));
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoD.get(i).add(in.nextInt());
            }
        }
        System.out.print("Array list : "+twoD);
    }
}
