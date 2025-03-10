import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger num1, num2,sum,product;
        num1=sc.nextBigInteger();
        num2=sc.nextBigInteger();
        sum=num1.add(num2);
        product=num1.multiply(num2);
        System.out.println(sum);
        System.out.println(product);
        
    }
}
