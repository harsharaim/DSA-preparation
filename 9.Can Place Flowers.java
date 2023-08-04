// 605. Can Place Flowers
// Easy
// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new 
// flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

// Example 1:
// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true

// Example 2:
// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false

// Example 3:
// Input: flowerbed = [0,0,0,0,1], n = 2
// Output: true

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0) return true; // if n=0 answer always true
        int count=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1|| flowerbed[i+1]==0)){
               count++;
               if(count==n){
                   return true;
               }
               i++; // since in flowerbed[i], flower can be planted flower[i+1] is not a place to plant flower so incrementing the counter .next i value is (i++)++=i+2;
            }
        }
        return false;
    }
}
