package array3052;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
// 입력받은 값의 %42를 통한 나머지 값의 index를 true로 바꾸어 준 뒤, 종료되면 true값의 개수를 세어준다
public class Main02 {
    public static void main(String[] args) throws IOException {
 
        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }
        
        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        System.out.println(count);
    }
}