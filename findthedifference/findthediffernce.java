class Solution {
    public char findTheDifference(String s, String t) {

        String str = s+t;
        int n = 0;
        for(int i =0; i<str.length(); i++) {
            n ^= str.charAt(i);
        }

        return (char)n;
    }
}