//Solved the leetcode problem to find the smallest Even multiple which is between 2 and n number
class Solution {
    public int smallestEvenMultiple(int n) {
        for(int i=n;i>0;i++)
        {
            if((i%2==0) && (i%n==0))
            {return i;}
        }
        return 0;
    }
}
