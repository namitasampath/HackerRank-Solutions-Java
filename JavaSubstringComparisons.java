import java.io.*;
import java.util.*;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        sc.close();
        
        String smallest=s.substring(0,k);
        String largest=s.substring(0,k);
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
            }
            System.out.println(smallest);
            System.out.println(largest);
        
        }
    }
