//Solved the leetcode problem to find target with less time and space complexity
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s=0,e=numbers.length-1;
        int sum=0;
        while(s<=e)                     //Using Binary Search algorithm
        {
            sum=numbers[s]+numbers[e];
            if(sum==target)
            {return new int[] {s+1,e+1};}
            else if(sum>target)
            {e--;}
            else
            {s++;}
        }
        return new int[] {0};
    }
}
// Time Complexity - O(n)
// Space Complexity - O(1)
