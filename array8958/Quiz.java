package array8958;

import java.util.Scanner;

//OX 퀴즈 문제
//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다.
//O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
//문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
//예를 들어, 10번 문제의 점수는 3이 된다.


public class Quiz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String arr[] = new String[in.nextInt()];
 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		
		in.close();
		
		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산 
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
		}
	}
}