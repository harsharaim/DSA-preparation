// 11. Container With Most Water
// Medium

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

// Example 1:
// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
// In this case, the max area of water (blue section) the container can contain is 49.

// Example 2:
// Input: height = [1,1]
// Output: 1

// My initial approach  --> Time Limit Exceeded 56/61
// Time complexity: O(2n)
// Space complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
              max=Math.max(max,(j-i)*Math.min(height[i],height[j])); 
            }
        }
        return max;
    }
}

// Solution (My approach 2)
// Time complexity: O(n)
// Space complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int left=0;  // left pointer
        int right=height.length-1;  // right pointer
        int max=0;
        while(right>left){
          max=Math.max(max,(right-left)*Math.min(height[left],height[right])); // find the area 
          if(height[right]<height[left]) right--;  // Move the pointer on the side with the smaller height
          else left++;
        }
        return max;
    }
}
