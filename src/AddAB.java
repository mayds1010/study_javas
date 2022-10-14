

//문제
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//refer:https://www.acmicpc.net/submit/1000/50429027
import java.util.Scanner;
public class AddAB{ //백준은 클래스이름을 메인으로 해야함
    public static void main(String[] args){
//입력
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
        
//출력
//첫째 줄에 A+B를 출력한다.  
        System.out.println(A+B);
        sc.close();
        
    }
}
    

