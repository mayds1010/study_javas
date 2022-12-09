import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_scores {

//BufferedReader방식
//(BufferedReader는 String 타입으로 입력,Integer.parseInt()로 int형으로 변환해줘야 함)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());// readLine()을 통해 입력 받아 연산

		if (A >= 90)
			System.out.println("A");
		else if (A >= 80)
			System.out.println("B");
		else if (A >= 70)
			System.out.println("C");
		else if (A >= 60)
			System.out.println("D");
		else
			System.out.println("F");// 기본방식보다 훨씬 코드가 간결해짐

	}
}
