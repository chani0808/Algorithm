package Test;

public class InsertionSort {
	public static void main(String[] args) {
		int insert[] = {60, 33, 55, 13, 12, 18, 24};
		int size = insert.length;
		
		int swap;
		
		for(int i =1;i<size;i++) {
			swap = insert[i];
			for(int j = i ; j > 0 ; j--) {
				if(insert[j-1]>swap) {
					insert[j] = insert[j-1];
					insert[j-1] = swap;
					
					System.out.print(i + "회차 : ");
					for(int h =0 ; h <size ; h++) {
						System.out.print(insert[h] + " ");
						
					}
					System.out.println();
				}
			}
		}
	}
	
}
