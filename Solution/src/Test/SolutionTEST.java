package Test;

import java.util.ArrayList;
import java.util.Collections;

public class SolutionTEST {

	public static int solution(int [] arr) {
		int answer = -1;
		ArrayList<Integer> al = new ArrayList<Integer> ();
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					 al.add(j-i);
					break;
				}
			}
			
		}
		if(!al.isEmpty()) {
			answer = Collections.min(al);
		}
		System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(new int []{2});
		
	}

}
