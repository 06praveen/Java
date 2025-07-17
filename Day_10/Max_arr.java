package Day_10;
import java.util.Scanner;

public class Max_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the elements of array : ");
        for(int i=0;i<5;i++)
        {
            arr[i] = in.nextInt();
        }
        max(arr);
    }

    static void max(int[] a){
        int max_no=0;
        for(int i=0;i<5;i++)
        {
            if(a[i]>max_no)
            {
                max_no=a[i];
            }
        }
        System.out.print("The Max element is : "+max_no);
    }
}
