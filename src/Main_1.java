// 문제 파악
// 두 정수 A와 B를 입력받은 다음, A+B를 출력
// 입력값은 (0 < A, B < 10)따라야 한다.
//첫째 줄에 테스트 케이스의 개수 T가 주어진다

// 유추 파악
//각 테스트 케이스마다 A+B를 출력(반복)

// 주요 단어 영문 이름 선정
// 입력 input
// 정수 decimal
// 출력 output
// 합 add(plus)

import java.util.Scanner;
public class Main_1 {
    //두 정수의 합 구함
    public int plus(int A, int B){
        int output = A + B;
        return output;
    }
    public static void main(String[] args) {
        
// 프로그래밍 순서
// 입력
Scanner sc = new Scanner(System.in);
int T, A, B;
T = sc.nextInt();//T가 위에 있어야 T를 중점으로 해서 반복
for (int i = 0; i < T; i++) {
    A = sc.nextInt();
    B = sc.nextInt();

// 처리
Main_1 main = new Main_1();
int output = main.plus(A,B);
// 출력
System.out.println(output);
}
sc.close();
}
}
		
		
		
	
	
