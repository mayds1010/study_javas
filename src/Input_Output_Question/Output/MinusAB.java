package Input_Output_Question.Output;
//문제
//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
//refer:https://www.acmicpc.net/submit/1001/50431018
import java.util.Scanner;
public class MinusAB {

public static void main(String[] args) {
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

//출력
//첫째 줄에 A-B를 출력한다.
    System.out.println(A-B);
    sc.close();
 }
}