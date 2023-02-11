package longestpalindromicsubstring;

public class longestpalindromicsubstring {
    public String longestPalindrome(String s) {
        int start=0,end=0;
        int len1=expandfromcentre(s,i,i+1);
        int len2=expandfromcentre(s,i,i);
        int len=Math.max(len1,len2);
    }
    return s.substring(start,end+1);
}
int expandfromcentre(String s,int i,int j){
    while(i>=0&&j<s.length()-1&&s.charAt(i)==s.charAt(j)){
        i--;
        j++;
    }
    return j-i-1;
}





    


