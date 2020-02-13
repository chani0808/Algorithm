package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Solution11 {
	
	static void majority(ArrayList<Integer> arr) {

    	HashSet<Integer> scoresSet = new HashSet<Integer>();
    	
    	for(int i = 0 ; i < arr.size() ; i++ ) {
    		scoresSet.add(arr.get(i));
    	}

    	ArrayList<Integer> scoresList = new ArrayList<Integer>(scoresSet);
    	
    	Collections.sort(arr);
    	
    	int k =scoresList.size()-1;
    	
    	
    	int cnt=0;
    	int max=0;
    	for (int j : arr) {
    		
    	}
    	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(4);
		arr.add(2);
		arr.add(3);
		arr.add(2);
		arr.add(1);
		arr.add(5);
		majority(arr);

	}

}
