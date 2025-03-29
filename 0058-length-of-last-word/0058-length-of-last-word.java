class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length();
        String arr [] = s.split(" ");
        String ans=arr[arr.length-1];
        return ans.length();
    }
}