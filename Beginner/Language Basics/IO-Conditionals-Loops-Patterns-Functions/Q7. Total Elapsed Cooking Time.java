/*You're going to write some code to help you cook a gorgeous lasagna from your favourite cookbook.
Now, you want to find the total number of minutes you've been cooking or the sum of your preparation time and the time the lasagna has already spent baking in the oven. The preparation time of one layer is 2 minutes.

Given the number of layers added to the lasagna and the number of minutes the lasagna has been baking in the oven, find the total elapsed cooking time (prep + bake) in minutes.*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);

        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();

        System.out.println(2*n + m);
        
    }
}
