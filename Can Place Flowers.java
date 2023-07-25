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
