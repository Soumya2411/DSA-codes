package subArray;

import java.util.Scanner;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class subArray {
    void main(){
        Scanner sc=new Scanner(System.in);
    System.out.println("enter string to traverse");
    String s=sc.nextLine();
    for(int i=0;i<s.length;i++){
        for(int j=i;j<s.length;j++){
            for(int k=i;k<=j;k++){
                System.out.println(arr[k]);
            }
        }
    }
    }
}
