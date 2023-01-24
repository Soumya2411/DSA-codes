import java.util.*;

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int l=sentences.length;
        for(int i=0;i<l;i++){
            max=Math.max(max, sentences[i].split(" ").length);
        }
        return max;
    }
}