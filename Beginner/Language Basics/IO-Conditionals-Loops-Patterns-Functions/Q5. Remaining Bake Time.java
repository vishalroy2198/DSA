/*You're going to write some code to help you cook a gorgeous lasagna from your favorite cookbook.
According to your cookbook, the Lasagna should be in the oven for 40 minutes:
Given the actual minutes the lasagna has been in the oven, find how many minutes the lasagna still needs to bake.
*/
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        System.out.println(40 - n);
        
    }
}
