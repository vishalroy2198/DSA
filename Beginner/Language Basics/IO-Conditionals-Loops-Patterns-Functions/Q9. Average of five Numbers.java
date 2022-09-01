import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        double a,b,c,d,e;
        a = sc.nextDouble();
        b = sc.nextDouble(); 
        c = sc.nextDouble(); 
        d = sc.nextDouble(); 
        e = sc.nextDouble();

        System.out.format("%.2f",(a+b+c+d+e)/5);
        
    }
}
