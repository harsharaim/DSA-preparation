// 1143. Longest Common Subsequence
// Medium

// Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.
// A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without
// changing the relative order of the remaining characters.
// For example, "ace" is a subsequence of "abcde".
// A common subsequence of two strings is a subsequence that is common to both strings.

// Example 1:
// Input: text1 = "abcde", text2 = "ace" 
// Output: 3  
// Explanation: The longest common subsequence is "ace" and its length is 3.

// Example 2:
// Input: text1 = "abc", text2 = "abc"
// Output: 3
// Explanation: The longest common subsequence is "abc" and its length is 3.

// Example 3:
// Input: text1 = "abc", text2 = "def"
// Output: 0
// Explanation: There is no such common subsequence, so the result is 0.

class Solution {
    public int commonSubsequence(String str1,String str2,int n1,int n2,int dp[][]){
        if(n1==0 || n2==0){
            return 0;
        }
        if(dp[n1][n2]!=-1){
            return dp[n1][n2];
        }
        if(str1.charAt(n1-1)==str2.charAt(n2-1)){
            dp[n1][n2]= 1+commonSubsequence(str1,str2,n1-1,n2-1,dp);
             return dp[n1][n2];
        }else{
            dp[n1][n2]= Math.max(commonSubsequence(str1,str2,n1-1,n2,dp),commonSubsequence(str1,str2,n1,n2-1,dp));
           return dp[n1][n2];
        }
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        int dp[][]=new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                dp[i][j]=-1;
            }
        }
        return commonSubsequence(text1,text2,n1,n2,dp);
    }
}
