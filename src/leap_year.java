import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leap_year {
//	BufferedReader방식
//(BufferedReader는 String 타입으로 입력,Integer.parseInt()로 int형으로 변환해줘야 함)
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int year = Integer.parseInt(br.readLine());
		if(year %400 == 0) {
			System.out.println(1);
		}else if(year %4 == 0 && year %100 !=0){
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
}