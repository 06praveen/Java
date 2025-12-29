//Solved the question using Time complexity O(n) and the code is successfully submited but 
//i have to go for binary search to enchanced the code
class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int count=0;
        while(n>=i)
        {
            n=n-i;
            i++;
            count++;
        }
        return count;
    }
}
