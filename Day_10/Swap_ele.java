//Here elements of array is swaped using swap function by using there indexes
package Day_10;
import java.util.Arrays;
import java.util.Scanner;

public class Swap_ele {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {7,18,45};
        System.out.println("The elements are : "+ Arrays.toString(arr));
        swap(arr,0,1);
        System.out.print("The elements are : "+ Arrays.toString(arr));
    }

    static void swap(int[] a,int i,int j)
    {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
