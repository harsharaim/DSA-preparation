// 238. Product of Array Except Self
// Medium

// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:
// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

// Example 2:
// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]

// My Approach
  class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero=0;
        int total=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zero++;
            if(nums[i]!=0) total*=nums[i];
        }
        if(zero>1){
          Arrays.fill(nums,0); // if the array contains more than one zero then product is zero for every element of the array
        }else{        
          for(int i=0;i<nums.length;i++){
            if(nums[i]==0){ 
             nums[i]=total; //when there is one element with '0' value in the array then the value of that element is total 
            }else{
              if(zero==1) nums[i]=0; // when there is one element with '0' value in the array product value for every element is '0' except for the one with '0' value
             else nums[i]=total/nums[i]; // if there is no element with '0' value in the array then the product is total/value of current element
            }
          }
        }
        return nums;
    }
}

// Solution 2
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1;
        int post=1;
        int n=nums.length;
        int out[]=new int[n];
        for(int i=0;i<n;i++){   // Calculate the product of all elements to the left of the current element
            out[i]=pre;
            pre=pre*nums[i];
        }
        for(int j=n-1;j>=0;j--){
            out[j]*=post;       // Calculate the product of all elements to the right of the current element
            post=post*nums[j];
        }
        return out;
    }
}
