//We have to search in a rotated sorted array such that the array may contain duplicate values using Binary Search
class Solution {
    public boolean search(int[] arr, int target) {
        int n=arr.length;
        int s=0,e=n-1;
        while(e>=s)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
            {return true;}

            if(arr[s]==arr[mid] && arr[mid]==arr[e])
            {
                s++;
                e--;
            }
            else if(arr[s]<=arr[mid])
            {
                if(arr[s]<=target && arr[mid]>target)
                {e=mid-1;}
                else
                {s=mid+1;}
            }
            else
            {
                if(arr[mid]<target && arr[e]>=target)
                {s=mid+1;}
                else
                {e=mid-1;}
            }
        }
        return false;
    }
}
