package baekjoon;


//문제
//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
//refer:https://www.acmicpc.net/submit/1001/50431018
import java.util.Scanner;
public class MinusAB {
    public int minus(int A,int B){
        int output_minus = A-B;
        return output_minus;
    }
//두 정수 마이너스구함
public static void main(String[] args) {
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    //처리
    MinusAB main = new MinusAB();
    int output_minus =main.minus(A, B);
//출력
//첫째 줄에 A-B를 출력한다.
    System.out.println(output_minus);
    sc.close();
 }
}