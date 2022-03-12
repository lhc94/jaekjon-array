package array3052;

import java.util.HashSet;
import java.util.Scanner;

//HashSet.add() 메소드
// 만약 중복되는 값이 없으면 HashSet에 저장되면서 True를 반환하게되고
// 중복되지 않으면 False를 반환한다.
// HashSet 의 크기(= 저장되어 있는 원소의 개수)를 반환

public class Main01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> hs = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			hs.add(sc.nextInt() % 42);
		//입력받은 값의 나머지 값을 add메소드를 통해 HashSet에 저장
		}
        
		sc.close();
		System.out.print(hs.size());
	}
}
