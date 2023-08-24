// 767. Reorganize String
// Medium

// Given a string s, rearrange the characters of s so that any two adjacent characters are not the same.
// Return any possible rearrangement of s or return "" if not possible.

// Example 1:
// Input: s = "aab"
// Output: "aba"

// Example 2:
// Input: s = "aaab"
// Output: ""

class Solution {
    public String reorganizeString(String s) {
       int hash[]=new int[26];
       for(int i=0;i<s.length();i++){
           hash[s.charAt(i)-'a']++;
       } 
       int max=0,letter=0;
       for(int i=0;i<hash.length;i++){
           if(hash[i]>max){
               max=hash[i];
               letter=i;
           }
       }
       if(max>(s.length()+1)/2) return "";

       char ans[]=new char[s.length()];
       int index=0;
       while(hash[letter]-->0){
           ans[index]=(char)(letter+'a');
           index+=2;
       }
       for(int i=0;i<26;i++){
           while(hash[i]-->0){
               System.out.println(String.valueOf(ans));
               if(index>=s.length()) index=1;
               ans[index]=(char)(i+'a');
               index+=2;
           }
       }
       return String.valueOf(ans);
    }
}
