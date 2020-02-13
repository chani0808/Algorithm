package Test;

public class TEST {
	
	public static int solution(int num) {
		int answer =0;
		
		for(int cnt =1;cnt<=num;cnt++) {
			String str = String.valueOf(cnt);
			for(int i = 0; i<str.length() ;i++) {
				char str_chk = str.charAt(i);
				if(str_chk =='3'||str_chk=='6'||str_chk=='9') {
					answer=answer+1;
				}
			}
			
		}
System.out.println(answer);
		return answer;
	}
	
	public static void main(String[] args) {
		solution(33);
	}

}
