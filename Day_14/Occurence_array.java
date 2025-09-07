//To find the occurence of element in array
package Day_14;
import java.util.Scanner;
import java.util.Arrays;

public class Occurence_array {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int n = in.nextInt();
    System.out.print("\nEnter the elements of array : ");
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i] = in.nextInt();
    }
    System.out.print("Enter the element to find : ");
    int f = in.nextInt();
    occur(n,arr,f);
  }
  
  public static void occur(int x,int[] y,int s)
  {
      int k=0,count=0;
      for(int j=0;j<x;j++)
      {
          if(y[j]==s)
          {
              k=1;
              count++;
          }
      }
      if(k==1)
      {
          System.out.print("Element "+s+" is occur "+count+" times");
      }
      else
      {
          System.out.print("Element "+s+" is not found");
      }
  }
}
