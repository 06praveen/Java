//We have to find the given number is perfect square or not and return boolean value
class Solution {
    public boolean isPerfectSquare(int num) {
        int s=1,e=num;
        while(e>=s)
        {
            int mid=s+(e-s)/2;
            long sqr=(long)mid*mid;
            if(sqr==num)
            {return true;}
            else if(sqr>num)
            {e=mid-1;}
            else
            {s=mid+1;}
        }
        return false;
    }
}
