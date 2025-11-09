//Floor Number is Binary Search logic problem in whic we have to return target or greatest number in among smaller than target
package Binary_Search;
import java.util.Scanner;

public class FloorNumber{
    public static void main(String[] args){            //main method
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter te elements of array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the number to search : ");
        int key = in.nextInt();
        int result = FloorSearch(arr,key);
        if(result==key)
        {
            System.out.print("The elements "+key+"is found");
        }
        else
        {
            System.out.print("The smallest greater elements than "+key+" is : "+result);
        }
        in.close();
    }

    public static int FloorSearch(int[] arr,int target){
        int s=0,e=arr.length-1;
        while(s<=e)                              //Binary Search Logic
        {
            int mid = s+((e-s)/2);
            if(arr[mid]==target)
            {return target;}
            else if(arr[mid]<target)
            {s=mid+1;}
            else
            {e=mid-1;}
        }
        return arr[e];
    }
}
