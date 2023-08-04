// 151. Reverse Words in a String
// Medium

// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.
// Note that s may contain leading or trailing spaces or multiple spaces between two words. 
// The returned string should only have a single space separating the words. Do not include any extra spaces.

// Example 1:
// Input: s = "the sky is blue"
// Output: "blue is sky the"

// Example 2:
// Input: s = "  hello world  "
// Output: "world hello"
// Explanation: Your reversed string should not contain leading or trailing spaces.

// Example 3:
// Input: s = "a good   example"
// Output: "example good a"
// Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

class Solution {
    public String reverseWords(String s) {
        if(s==null || s.length()==0) return "";
        s=s.trim(); //remove extra space from left and right of the string 
        StringBuilder res=new StringBuilder(); 
        String[] words=s.split(" "); // create a string array with words in the string s as element
        for(int i=words.length-1;i>=0;i--){ 
            if(!words[i].equals("")){
                res.append(words[i]);
                if(i!=0) res.append(" ");  // when we reach to the last word no need to append a space
            }
        }
        return res.toString();  // convert the result in StringBuilder type to string and return the result
    }
}
