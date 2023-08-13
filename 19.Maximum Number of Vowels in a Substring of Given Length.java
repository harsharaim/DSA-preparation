// 1456. Maximum Number of Vowels in a Substring of Given Length
// Medium

// Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
// Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

// Example 1:
// Input: s = "abciiidef", k = 3
// Output: 3
// Explanation: The substring "iii" contains 3 vowel letters.

// Example 2:
// Input: s = "aeiou", k = 2
// Output: 2
// Explanation: Any substring of length 2 contains 2 vowels.

// Example 3:
// Input: s = "leetcode", k = 3
// Output: 2
// Explanation: "lee", "eet" and "ode" contain 2 vowels.

// My initial Approach
// Time complexity:O(n)
// Space complexity:O(1)
class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))) count++;
        }
        int max_count=count;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i))) count++;
            if(isvowel(s.charAt(i-k))) count--;
            max_count=Math.max(max_count,count);
        }
        return max_count;
    }
    public boolean isvowel(char c){
      if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')return true;
      return false;
    }
}
