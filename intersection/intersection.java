package intersection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class intersection {
    // int count=0;
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter two arrays");
    

    int intersect(int[]a,int[]b){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                   count++;
                   set.remove(b[i]);
            }
        }
    }
    return count;
}
