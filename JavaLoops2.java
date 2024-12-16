import java.util.*;
import java.io.*;
import java.math.*;
class JavaLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int sum=0;
        for(int i=0;i<t;i++){
            
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int k=1;k<=n;k++){
                   for(int j=0;j<k;j++){ 
                    sum=sum+(int)((Math.pow(2, j))*b);
                }System.out.print(a+sum+ " ");sum=0;
            }System.out.println();
            
        }
        in.close();
    }
}
