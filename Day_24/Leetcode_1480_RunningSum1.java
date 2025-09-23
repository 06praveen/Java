//Solved the leetcode problem to Running Sun of 1D Array solution with higher time complexity
class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i+1;j++)
            {
              arr[i] = arr[i]+nums[j];
            }
        }
        return arr;
    };
}
//Time Complexity - O(N²)
