/*78. Subsets
Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
  
Example 2:
Input: nums = [0]
Output: [[],[0]]
 
Constraints:
1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique. */

//code

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        list=subset(nums);
        return list;
    }
    static List<List<Integer>>subset(int[]nums){
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int k:nums){
            int s=outer.size();
            for(int i=0;i<s;i++){
                List<Integer>inner=new ArrayList<>();
                inner.addAll(outer.get(i));
                inner.add(k);
                outer.add(inner);
            }
        }
        return outer;
    }
}
