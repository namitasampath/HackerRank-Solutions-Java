import java.io.*;
import java.util.*;
import java.util.regex.*;

public class JavaRegex {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNext()){
            String IP = sc.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        
    }
}
class MyRegex{
    static final String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    /*This regex validates an IPv4 address. Each octet must be a number between 0-255, with three dots separating the four octets. It ensures the entire string matches the format using ^ and $. Key patterns:
25[0-5]: Matches 250-255
2[0-4][0-9]: Matches 200-249
[01]?[0-9][0-9]?: Matches 0-199*/
    public String getPattern(){
        return pattern;
    }
}
