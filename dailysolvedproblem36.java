/*1493. Longest Subarray of 1's After Deleting One Element

Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

Example 1:
Input: nums = [1,1,0,1]
Output: 3
Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.

Example 2:
Input: nums = [0,1,1,1,0,1,1,0,1]
Output: 5
Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].

Example 3:
Input: nums = [1,1,1]
Output: 2
Explanation: You must delete one element.
 
Constraints:
1 <= nums.length <= 105
nums[i] is either 0 or 1.*/

//solution
class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int j=0;
        int count=0;
        int ele=0;
        int zero=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==0){
                zero++;
            }
        }
        if(zero==nums.length){
            return 0;
        }
        if(zero==1){
            return nums.length-1;
        }
        while(j<nums.length){
             if(nums[j]==1){
                j++;
            }
            else if(nums[j]==0&&(nums[i]==1)){
                if(count==0){
                    j++;
                count++;
                }
                else {
                   if ((j-i-1)>ele){
                    ele=j-i-1;
                }
                count=0;
                i++;
                j=i+1;
            }
            }
            else{
                if((j-i-1)>ele){
                    ele=j-i-1;
                }
                count=0;
                i++;
                j=i+1;
            }
        }
        if(((j-i-1)>ele)){
                    ele=j-i-1;
                }
                
        return ele;
    }
}
