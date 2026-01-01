//Given a number 'x' and we to get the sqrt of any number in terms of integer value
class Solution {
    public int mySqrt(int x) {
        int s=0,e=x;
        int ans=0;
        while(e>=s)
        {
            int mid=s+(e-s)/2;
            long sq=(long)mid*mid;
            if(sq==x)
            {return mid;}
            else if(sq>x)
            {e=mid-1;}
            else
            {
                ans=mid;
                s=mid+1;
            }
        }
        return ans;
    }
}
