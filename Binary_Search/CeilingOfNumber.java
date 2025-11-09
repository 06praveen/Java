//Code in java to search a number in array or the smallest number among the gretaest number than the key value
package Binary_Search;
import java.util.Scanner;

public class CeilingOfNumbers{
    public static void main(String[] args){     //main function
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter te elements of array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();                        //Array input from user
        }
        System.out.print("Enter the number to search : ");
        int key = in.nextInt();
        int result = CeilingSearch(arr,key);             //Calling the method by value and storing the result;
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

    public static int CeilingSearch(int[] arr,int target){          //Ceiling Logic method
        int s=0,e=arr.length-1;
        while(s<=e)                                       //Binary Search Logic
        {
            int mid = s+((e-s)/2);
            if(arr[mid]==target)
            {
                return target;
            }
            else if(arr[mid]<target)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return arr[s];                    //Returns the smallest among the greatest numbers than the key
    }
}
