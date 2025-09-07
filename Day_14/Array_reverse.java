//Created a array of own size which will show reversed value
package Day_13;
import java.util.Arrays;
import java.util.Scanner;

public class Array_reverse{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = in.nextInt();
        System.out.print("Enter the elements of array : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int j=0;j<(size/2);j++)
        {
            int temp;
            temp=arr[j];
            arr[j]=arr[size-1];
            arr[size-1]=temp;
            size--;
        }
        System.out.println("The reversed array is : "+Arrays.toString(arr));
    }
}
