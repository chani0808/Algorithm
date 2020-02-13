package Test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
 *
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

	Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

	For example, given the array  there are  elements, two positive, two negative and one zero. Their ratios would be ,  and . It should be printed as 

 * 	6
	2-4 3 -9 0 4 1
	0.500000

	0.333333

	0.166667



 */

public class Solution5 {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
    	float a = 0f,b =0f, c=0f;
        int size =arr.length;
        for(int i =0; i<size;i++){
            if(arr[i]>0){
                a=a+1;
            }else if(arr[i]<0){
                b=b+1;
            }else{
                c=c+1;
            }
        }
        System.out.println(String.format("%.6f",a/size));
        System.out.println(String.format("%.6f",b/size));
        System.out.println(String.format("%.6f",c/size));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
