package union;

import java.util.HashSet;
import java.util.Set;

public class union {
    int union(int[]a ,int[]b){
        Set<E> <Integer> set=new HashSet<>();
        for(int x:a){
            set.add(x);
        }
        for(int x:b){
            set.add(x);
        }
        return set.size();
    }
}
