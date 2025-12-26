/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

//This is the same question as the previous peak element in mountain array question but in this first we have to find the
//peak element of the array then we have to split searching in 2 different method
//The first one for increasing and if the target if not found than we have to go for decreasing binary search
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int end=peakElement(arr);
        int result=binarySearchIncreasing(arr,end,target);
        if(result==-1)
        {
            result=binarySearchDecreasing(arr,end,target);
        }
        return result;
    }

    public int peakElement(MountainArray arr){
        int n=arr.length();
        int s=0,e=n-1;
        while(e>s)
        {
            int mid = s+(e-s)/2;
            if(arr.get(mid)>arr.get(mid+1))
            {
                e=mid;
            }
            else
            {s=mid+1;}
        }
        return e;
    }

    public int binarySearchIncreasing(MountainArray arr,int end,int target){
        int start=0;
        //For increasing Array
        while(end>=start)
        {
            int mid=start+(end-start)/2;
            if(arr.get(mid)==target)
            {
                return mid;
            }
            else if(arr.get(mid)>target)
            {end=mid-1;}
            else
            {start=mid+1;}
        }
        return -1;
    }

    public int binarySearchDecreasing(MountainArray arr,int end,int target){
        int start=end+1;
        end=arr.length()-1;
        //For decreasing Array
        while(end>=start)
        {
            int mid=start+(end-start)/2;
            if(arr.get(mid)==target)
            {
                return mid;
            }
            else if(arr.get(mid)>target)
            {start=mid+1;}
            else
            {end=mid-1;}
        }
        return -1;
    }
}
