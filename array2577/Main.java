package array2577;
//백준 2577번 문제

import java.util.Scanner;

// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지
// 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
// 예를 들어 A = 150, B = 266, C = 427 이라면
// A × B × C = 150 × 266 × 427 = 17037300 이 되고,
// 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
public class Main {
	public static void main(String[] args) {
// 나 
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		int result = num1 * num2 * num3;
//		
//		// 숫자 -> 문자 
//		String number = "123456789";
//		String to_st = Integer.toString(result);
//		int cnt = 0;
//		
//		System.out.println(to_st);
//		//각각의 자리 수를 뺴서 비교해서 수 새기
//		
//		// cnt 수를 대입해서 char값에 넣어버리면끝넣어버리기
//		for (int i = 0; i < 10; i++) {
//			char num = number.charAt(i);
//			for (int j = 0; j < to_st.length(); j++) {
//				char ts = to_st.charAt(j);
//				if(num == ts) {
//					cnt++;
//					ts = Integer.toString(cnt).charAt(0);
//				}
//			}
//		}
//		sc.close();
		
	Scanner in = new Scanner(System.in);
	 
	int value = (in.nextInt() * in.nextInt() * in.nextInt());
	String str = Integer.toString(value);
	in.close();
	
	for (int i = 0; i < 10; i++) {
		int count = 0;
		for (int j = 0; j < str.length(); j++) {
			if ((str.charAt(j) - '0') == i) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	}
}

// 나 : 같은 0부터9까지들의 문자열을 만들고, 입력한 결과 값을 문자char로 비교해서
// 같으면 cnt를 1씩 증가시키고 to_st객체안에 대입 시키려고 했다

// 굳이 to_st에 대입시키는 과정이 더 복잡하고

// for문자체의 i 값이 어짜피 0부터 9까지의 숫자이니까 이걸 이용해서 to_st의 각각의 문자와 비교해서
// 같으면 cnt를 1씩 증가함 
