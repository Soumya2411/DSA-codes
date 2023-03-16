package reverse;

import java.util.Stack;

public class reverse {
    class Solution {
        public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String k[]=s.split(" ");
               Stack<String> st=new Stack<>();
               for(int i=0;i<k.length;i++){
                if(k[i].isEmpty()){
                    continue;
                }
                st.push(k[i]);
               }
               while(!st.isEmpty()){
                sb.append(st.pop());
                sb.append(" ");
               }
               return sb.toString().trim();
        }
}
}