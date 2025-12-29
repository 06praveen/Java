//Simple question just we have to find the target usin binary search
class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int s=0,e=n-1;
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
        return -1;      //If target not found in the array
    }
}
