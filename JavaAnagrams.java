import java.io.*;
import java.util.*;

public class JavaAnagrams {
    public static boolean areAnagrams(String s1,String s2){
            char[] arr1=s1.toCharArray();
            char[] arr2=s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
            
        }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine().toLowerCase();
        String s2=sc.nextLine().toLowerCase();
        if (areAnagrams(s1,s2)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }}
        
}
