package Test;

import java.util.HashMap;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		map.put(1, "kim");
		map.put(1, "lee");
		map.put(1, "c");
		map.put(1, "d");
		
		System.out.println(map.size());
		System.out.println(map.get(1));
	}

}
