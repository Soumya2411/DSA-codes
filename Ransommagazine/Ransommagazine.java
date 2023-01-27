package Ransommagazine;

public class Ransommagazine {
    String ransom, String magazine;
    int [] alpha=new int[26];
    if(ransom.length()>magazine.length()){
        return false;

    }
    else{
        for(char c:magazine.toCharArray()){
alpha[c-'a']++;

for(char c:ransom.toCharArray()){
    if(apha[c-'a'==0]){
        return false;
    }
    else{
        alpha[c-'a']--;
    }
    return true; 
}
        }
    }
}
