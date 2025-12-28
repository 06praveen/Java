//We have search the target in the given rotated sorted array.
//It is same as the mountain array but a little change in logic to find the pivot i.e the peak element of the array
class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int pivot = pivotSearch(arr);
        int result = binarySearch(arr,target,0,pivot);     //Searching on the left handside of the pivot
        if(result==-1)
        {
            result=binarySearch(arr,target,pivot+1,n-1);    //Searching on the right handside of the peak if target is not found on the left
        }
        return result;
    }

  //To find the pivot i.e the peak element in the given array
    public int pivotSearch(int[] arr){
        int n=arr.length;
        int s=0,e=n-1;
        while(e>s)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]>arr[mid+1])        //Test Cases
            {
                return mid;
            }
            else if(arr[mid]>=arr[s])
            {s=mid+1;}
            else
            {e=mid;}
        }
        return 0;
    }

  //Normal Binary Search Method to find the target
    public int binarySearch(int[] arr,int target,int s,int e){
        int ans=-1;
        while(e>=s)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {return mid;}
            else if(arr[mid]>target)
            {e=mid-1;}
            else
            {s=mid+1;}
        }
        return ans;
    }
}
