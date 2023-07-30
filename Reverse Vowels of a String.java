// 345. Reverse Vowels of a String
// Easy

// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

// Example 1:
// Input: s = "hello"
// Output: "holle"

// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"

class Solution {
    public String reverseVowels(String s) {
        char[] ans = s.toCharArray();
        int left = 0;
        int right = ans.length - 1;
        while (left < right) {
            while (left < right && !isVowel(ans[left])) {
                left++;
            }
            while (left < right && !isVowel(ans[right])) {
                right--;
            }
            if (left < right) {
                char temp = ans[left];
                ans[left] = ans[right];
                ans[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ans);
    }
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
