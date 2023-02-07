public class validanagram {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        for(char i : s.toCharArray()){
            map[i-'a']++;
        }
        for(char i: t.toCharArray()){
            map[i-'a']--;
        }
        for(int j:map){
            if(j!=0);
            return false;
        }
        return true;
    }
}
