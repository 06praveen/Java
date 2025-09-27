//Solved the leetcode problem to find target from Two Sum II - Input Array is sorted
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length-1;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==target)
                {return new int[] {i+1,j+1};}
            }
        }
        return new int[] {0};
    }
}
// Time Complexity - O(N²)
// Space Complexity - O(1)
