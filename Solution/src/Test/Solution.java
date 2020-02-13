package Test;

import java.util.*;

public class Solution {
	public static void main(String[] args) {
		Card card1 =new Card(6);
		Card card2 =new Card(1);
		Card card3 =new Card(2);
		Card card4 =new Card(3);
		System.out.println(Card.cnt);
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * Scanner sc= new Scanner(System.in); int a =5; int b=3; for(int i=0;i<b;i++) {
	 * for(int j=0;j<a;j++) { System.out.print('*'); } System.out.println(); }
	 * 
	 * 
	 * }
	 * 
	 */
	/*
	 * public static int[] solution (int [][] v) { int [] answer = new int[2];
	 * 
	 * for(int i=0;i<2;i++) { if(v[0][i]!=v[1][i])
	 * answer[i]=v[0][i]+v[1][i]-v[2][i]; else if(v[0][i]==v[1][i]) answer[i] =
	 * v[2][i]; System.out.print(answer[i]+" "); }
	 * 
	 * return answer; } public static void main(String[] args) { solution(new
	 * int[][] {{1,4},{3,4},{3,10}}); }
	 */
	/*
	 * public String Solution(String word){ String result=""; String[] array_word;
	 * String[] change_world =
	 * {"Z","Y","x","W","V","U","T","S","R","Q","P","O","N","M","L","K","J","I","H",
	 * "G","F","E","D","C","B","A"}; Map<String,String> alpha = new
	 * HashMap<String,String>(); char[] alphabat = new char[26]; for(int i
	 * =0;i<alphabat.length;i++) {
	 * alpha.put(Character.toString((char)('A'+i)),change_world[i]);//숫자 쌍 맞춰주기 }
	 * array_word =word.split("");
	 * 
	 * for(String c_word : array_word) { boolean is_upp
	 * =Character.isUpperCase(c_word.charAt(0));
	 * 
	 * String temp_result =alpha.get(c_word.toUpperCase())); if(temp_result==null) {
	 * temp_result =" "; }else if(!is_upp) { temp_result.toLowerCase(); }
	 * 
	 * result = temp_result.concat(temp_result); }
	 * 
	 * return result; }
	 */
	}
class Card{
	static int cnt;
	int data;
	Card(int data){
		this.data = data;
		cnt++;
	}
}