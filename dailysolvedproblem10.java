/*231. Power of Two
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16

Example 3:
Input: n = 3
Output: false*/
//code
class Solution {
    public boolean isPowerOfTwo(int n) {
        return power(n,0);
    }
    static boolean power(int n,int a){
        long value=(long)Math.pow(2,a);
        if(value>n){
            return false;
        }
        else if(value==n){
            return true;
        }
        return power(n,a+1);
    }
}
