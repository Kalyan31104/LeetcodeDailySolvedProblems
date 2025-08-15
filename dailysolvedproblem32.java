/*342. Power of Four

Given an integer n, return true if it is a power of four. Otherwise, return false.
An integer n is a power of four, if there exists an integer x such that n == 4x.

Example 1:
Input: n = 16
Output: true

Example 2:
Input: n = 5
Output: false

Example 3:
Input: n = 1
Output: true
 
Constraints:
-231 <= n <= 231 - 1 */

//solution

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
        long sum=0;
        for(int i=0;sum<n;i++){
            sum=(long)Math.pow(4,i);
        }
        if(sum==n){
            return true;
        }
        return false;
    }
}
