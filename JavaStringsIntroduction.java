import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.charAt(0)>B.charAt(0))
        System.out.println("Yes");
        else System.out.println("No");
        for(int i=0;i<A.length();i++)
        {
            if(i<1){
            System.out.print(Character.toUpperCase(A.charAt(i)));}else
            System.out.print(A.charAt(i));
            
        }
         for(int i=0;i<B.length();i++)
        {
            if(i<1){
            System.out.print(" "+Character.toUpperCase(B.charAt(i)));}else
            System.out.print(B.charAt(i));
            
        }
        
    }
}
