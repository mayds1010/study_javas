package baekjoon;
import java.util.Scanner;

public class Main_2{
    //세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램
	public static void main(String[] args) {
        //입력
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int num1=(A+B)%C;
		int num2=((A%C+B%C))%C;
		int num3=(A*B)%C;
		int num4= ((A%C) * (B%C))%C;
        //처리

        //출력
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
	}
}