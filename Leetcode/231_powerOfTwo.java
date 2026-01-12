//Just we have to check wheather the given integer comes in 2^power or not
class Solution {
    public boolean isPowerOfTwo(int n) {
        return ((n>0) && (n&(n-1)==0));
    }
}
