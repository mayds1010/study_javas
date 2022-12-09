import java.util.Scanner;
//baekjoon_8393
public class Main_3 {
    // - 테스트 케이스
    // 3 --> 6
    // 5 --> 15
    // 1 --> 1
    public int sum(int input) {
        int sum = 0; //function후보
        for(int i=1;i<=input;i++){
            sum = sum + i; //function후보
        }
        return sum;
    }
    public static void main(String[] args) {
    // 반복값 입력
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    scanner.close();

    // 합 구함
   Main_3 main =new Main_3();
   int output =main.sum(input);

    // 합한 값 출력
    System.out.println(output);
    }
    public int plus(int a, int b) {
        return 0;
    }
    
}
