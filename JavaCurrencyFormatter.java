import java.util.*;
import java.text.*;
import java.lang.String;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        String demo=payment+"";
        StringBuilder fr;
        for(int i=0;i<fr.length();i++){
            if(demo.charAt(i)=='.')
            {
                if (demo.charAt(i) == '.') {
        fr.setCharAt(i, ','); 
            }
        }
        demo=demo/
        String us="$"+demo;
        String india="Rs."+demo;
        String china="￥"+demo;
        String france= fr+" €";
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
