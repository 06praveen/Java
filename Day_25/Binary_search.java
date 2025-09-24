package Day_25;

public class Binary_search {
    public static void main(String[] args){
        int[] arr = {2,5,7,9,14,18,24,27};            //given array
        int target = 18;                              //element to be search
        search(arr,target);
    }    
    public static void search(int[] arr,int x){
        int s=0,e=arr.length-1;
        boolean z = false;
        while(s<e)                           //Binary search logic
        {
            int mid = (s+e)/2;
            if(arr[mid]==x)
            {
                z = true;
                break;
            }
            else if(arr[mid]<x)
            {
                s = mid+1;
            }
            else
            {
                e = mid-1;
            }
        }
        System.out.print("Target found is "+z);
    }
    
}
