//Given a rotated sorted array and we have to find the minimum number from the arr
//Approach is first find the pivot/peak element in the array
//After getting the pivot element, we know that in roated sorted array the minimum element will be the element after pivot
//Or if the pivot is the last element of the array then we have go for the first element of the array
class Solution {
    public int findMin(int[] arr) {
        int n=arr.length;
        int pivot=peakElement(arr);
        if(pivot==n-1)
        {return arr[0];}
        else
        {return arr[pivot+1];}
    }

    public int peakElement(int[] arr){
        int n=arr.length;
        int s=0,e=n-1;
        while(e>=s)
        {
            int mid=s+(e-s)/2;
            if(e>mid && arr[mid]>arr[mid+1])
            {return mid;}
            else if(s<mid && arr[mid]<arr[mid-1])
            {return mid-1;}
            else if(arr[mid]>arr[s])
            {s=mid+1;}
            else
            {e=mid-1;}
        }
        return -1;
    }
}
