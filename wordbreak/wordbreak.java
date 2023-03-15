import java.util.List;

public class wordbreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int [] dp=new int[s.length()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<=i;j++){
String w2check= s.substring(j, i+1);
if(wordDict.contains(w2check)){
    if(j>0){
    dp[i]+=dp[j-1];
}
else{
    dp[i]+=1;
}
            }
        }
}
return dp[s.length()-1]>0;
    }
}
