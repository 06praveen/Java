//We have to calculate the absolute difference between the given integer and reverse of given integer abs(n-reverse(n))
class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int temp=n;
        while(temp>0)
            {
                int rem=temp%10;
                rev=rev*10+rem;
                temp /= 10;
            }
        return Math.abs(n-rev);
    }
}
