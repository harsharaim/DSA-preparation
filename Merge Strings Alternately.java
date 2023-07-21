class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int len1=word1.length();
        int len2=word2.length();
        int i=0;
        while(i<len1 || i<len2){
            if(i<len1){
                ans.append(word1.charAt(i));
            }
            if(i<len2){
                ans.append(word2.charAt(i));
            }
            i++;
        }
        return ans.toString();
    }
}