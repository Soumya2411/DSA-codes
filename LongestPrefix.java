class Solution {
    public String longestCommonPrefix(String[] strs) {
        int l=strs.length;
        Arrays.sort(strs);
        int i=0;
        int end=Math.min(strs[i].length(),strs[l-1].length());
        while(i<end && strs[0].charAt(i)==strs[l-1].charAt(i))
        {
i++;
        }
        String g=strs[0].substring(0,i);
        return g;
    }
}