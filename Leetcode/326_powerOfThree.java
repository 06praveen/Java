//Similar question like recently solved to check but for power of 3 this time
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
        {return false;}
        while(n%3==0)
        {
            n/=3;
        }
        return n==1;
    }
}
