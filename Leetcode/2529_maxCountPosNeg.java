//Solved a leetcode problem to return the maximum count between the negative and positive integer in a sorted array using binary search
class Solution {
    public int maximumCount(int[] arr) {
        int n = arr.length;

        if (arr[0] > 0) 
        {return n;} 
        else if (arr[n - 1] < 0) 
        {return n;} 
        else 
        {
            int negativeCount = binarySearch(arr,0);
            int positiveCount = n-binarySearch(arr,1);

            return (negativeCount>=positiveCount)?negativeCount:positiveCount;
        }
    }

    public int binarySearch(int[] arr,int target) {
        int s = 0, e = arr.length - 1;
        int ans = arr.length;

        while (e >= s) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
}
