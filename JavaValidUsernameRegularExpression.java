import java.io.*;
import java.util.*;
class UsernameValidator {
    // Regular expression to match valid usernames
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
public class JavaValidUsernameRegularExpression {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        while(n!=0){
            String username = sc.nextLine();
            if(username.matches(UsernameValidator.regularExpression)){
            System.out.println("Valid");}
            else{
            System.out.println("Invalid");
            }n--;
        }
    }
}
