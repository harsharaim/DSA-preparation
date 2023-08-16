// 1493. Longest Subarray of 1's After Deleting One Element
// Medium

// Given a binary array nums, you should delete one element from it.
// Return the size of the longest non-empty subarray containing only 1's in the resulting array.
// Return 0 if there is no such subarray.

// Example 1:
// Input: nums = [1,1,0,1]
// Output: 3
// Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.

// Example 2:
// Input: nums = [0,1,1,1,0,1,1,0,1]
// Output: 5
// Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].

// Example 3:
// Input: nums = [1,1,1]
// Output: 2
// Explanation: You must delete one element.

class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount=0;
        int left=0,right;
        int max=0;
        for(right=0;right<nums.length;right++){
           if(nums[right]==0) zeroCount++;
           while(zeroCount>1){
             if(nums[left]==0) zeroCount--;
             left++;
           }
           max=Math.max(max,right-left);
        }
      if(max==nums.length){
        return max-1;
      }
      return max;
    }
}
