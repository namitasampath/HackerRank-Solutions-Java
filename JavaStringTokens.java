import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.nextLine();
        
        // Split the input string using a regular expression that matches non-alphabetic characters
        // [^a-zA-Z] matches any character that is NOT a letter (uppercase or lowercase)
        String [] tokens= s.split("[^a-zA-Z]");
        int wordLength = 0;//for count
        for(int i=0;i<tokens.length; ++i)
        if(tokens[i].length()>0)// If the token is not empty, it is a valid word
        wordLength++;
        
        System.out.println(wordLength);
        
        for (int i=0;i<tokens.length;i++)
        if(tokens[i].length()>0)
        System.out.println(tokens[i]);
    }
}
