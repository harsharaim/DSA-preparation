// 75. Sort Colors
// Medium

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same 
// color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.

// Example 1:
// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

// Example 2:
// Input: nums = [2,0,1]
// Output: [0,1,2]

// Initial approach
class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[left]=0;
                left++;
            }else if(nums[i]==2){
                ans[right]=2;
                right--;
            }
        }
        for(int i=left;i<=right;i++){
            ans[i]=1;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ans[i];
        }
    }
}


// Dutch national flag algorithm
class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
               nums[mid]=nums[low];
               nums[low]=0;
               low++;
               mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
        }
    }
}
