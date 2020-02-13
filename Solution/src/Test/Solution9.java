package Test;

import java.util.Scanner;
/*
 * There are three lines of input:

	The first line contains an integer.
	The second line contains a double.
	The third line contains a String.
	There are three lines of output:

	On the first line, print String: followed by the unaltered String read from stdin.
	On the second line, print Double: followed by the unaltered double read from stdin.
	On the third line, print Int: followed by the unaltered integer read from stdin.
	
	Sample Input

	42
	3.1415
	Welcome to HackerRank's Java tutorials!
	Sample Output

	String: Welcome to HackerRank's Java tutorials!
	Double: 3.1415
	Int: 42

 */

public class Solution9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
        // Write your code here.
        scan.nextLine();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        
        
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


