package Test;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;
		int data[] = new int[10];

		for(int a=0; a<10; a++) { //입력
			data[a] = sc.nextInt();
		}
		
		for(int i=0; i<=8; i++) { //핵심
			for(int j = i+1; j<=9; j++) {
				if(data[i]>data[j]) { 
					k = data[i]; 
					data[i] = data[j]; 
					data[j] = k; 
				}
			}
		}
		
		for(int b = 0; b <= 9; b++) { //출력
			System.out.print(data[b]+ " ");
		}
	}

}


