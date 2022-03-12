package array2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 나머지값을 인댁스값으로 하고 1씩 증가 하는 방식


public class Main01 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		int val = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		
		while(val!=0) {
			arr[val%10]++;
			System.out.println(val%10);
			val/=10;
		}
		
		for(int result : arr) {
			System.out.println(result);
		}
	}
}
