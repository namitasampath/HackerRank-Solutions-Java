import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaPatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();//consume leftover newline
        while(num!=0){
            String pattern= sc.nextLine();
           try {
                Pattern.compile(pattern);
                /*this method of Pattern class takes a regex pattern (as a string) and compiles it into a pattern object.*/
                System.out.println("Valid");
            } catch (PatternSyntaxException e)//if pattern is not valid then exception is thrown.
             {
                System.out.println("Invalid");
            }
            num--;
        }
    }
}
