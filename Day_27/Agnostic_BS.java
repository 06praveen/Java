//Created a Binary search in array which can search element in both ascending and decensing order array
package Day_27;
import java.util.Scanner;

public class Agnostic_BS {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = in.nextInt();
        System.out.print("Enter the elements in a sorted order : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target to search : ");
        int target = in.nextInt();
        System.out.print("Element "+target+" found in array is "+search(arr,target));
        in.close();
    }
    public static boolean search(int[] arr,int x)
    {
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==x)
            {return true;}
            if(arr[e]>arr[s])
            {
                if(x>arr[mid])
                {s = mid+1;}
                else
                {e = mid-1;}
            }
            else
            {
                if(x>arr[mid])
                {e = mid-1;}
                else
                {s = mid+1;}
            }
        }
        return false;
    }
}
