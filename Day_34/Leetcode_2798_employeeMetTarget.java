//Solved the leetcode problem to count the no. of employee who met the target
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int i=0;i<hours.length;i++)
        {
            if(hours[i]>=target)
            {count++;}
        }
        return count;
    }
}
// Time Complexity - O(n)
// Space Complexity - O(1)
