package Day_10;
import java.util.Arrays;

public class Reverse_arr {
    public static void main(String[] args) {
        int[] arr = {7,18,10,77,45,1};
        System.out.println("The array is : "+Arrays.toString(arr));
        reverse(arr);
    }

    static void reverse(int[] a)
    {
        int j=a.length-1;
        int temp=0;
        for(int i=0;i<j;i++)
        {
                temp = a[j];
                a[j]=a[i];
                a[i]=temp;
                j--;
        }
        System.out.print("The reverse array is : "+Arrays.toString(a));

    }
}
