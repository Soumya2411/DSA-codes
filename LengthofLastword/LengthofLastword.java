class Solution {
    public int lengthOfLastWord(String s) {
        int l=s.length();
        String[] arr=s.split(" ");
        String g=arr[arr.length-1];
        int k=g.length();
        return k;

    }
}