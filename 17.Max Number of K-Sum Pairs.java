// 1679. Max Number of K-Sum Pairs
// Medium

// You are given an integer array nums and an integer k.
// In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
// Return the maximum number of operations you can perform on the array.

// Example 1:
// Input: nums = [1,2,3,4], k = 5
// Output: 2
// Explanation: Starting with nums = [1,2,3,4]:
// - Remove numbers 1 and 4, then nums = [2,3]
// - Remove numbers 2 and 3, then nums = []
// There are no more pairs that sum up to 5, hence a total of 2 operations.

// Example 2:
// Input: nums = [3,1,3,4,3], k = 6
// Output: 1
// Explanation: Starting with nums = [3,1,3,4,3]:
// - Remove the first two 3's, then nums = [1,4,3]
// There are no more pairs that sum up to 6, hence a total of 1 operation.

// My Initial approach Time Limit Exceeded 42 / 51 testcases passed
// Time Complexity: O(n^2) -->contains() and indexOf() methods in an ArrayList have a worst-case time complexity of O(n)
// Space Complexity: O(n)
class Solution {
    public int maxOperations(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
           int target=k-nums[i];
           if(list.contains(target)){
               list.remove(list.indexOf(target));
           }else{
               list.add(nums[i]);
           }
       }
       return (nums.length-list.size())/2;
    }
}

// Solution (My second Approach)
// Time Complexity: O(nlogn) --> Arrays.sort() time complexity is O(n log n)
// Space Complexity: O(1)
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int count=0;
        while(right>left){
            if(nums[left]+nums[right]==k){
              count++;
              left++;
              right--;
            }
            else if(nums[left]+nums[right]>k) right--;
            else left++;
        }
        return count;
    }
}
