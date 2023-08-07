// 392. Is Subsequence
// Easy

// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the
// characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

// Example 1:
// Input: s = "abc", t = "ahbgdc"
// Output: true

// Example 2:
// Input: s = "axc", t = "ahbgdc"
// Output: false

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
    public boolean isSubsequence(String s, String t) {
        int pos=0;
        if(s.length()==0) return true; // empty string considered to be a subsequence
        for(int i=0;i<t.length();i++){
            if(s.charAt(pos)==t.charAt(i)) pos++;
            if(pos==s.length()) return true; // if we reach the end of s then s is a subsequence of t
        }   
        return false;
    }
}
