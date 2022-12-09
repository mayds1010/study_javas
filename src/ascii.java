import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ascii {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); //string으로 입력받고
        char c = s.charAt(0);//c를 char로 변환
        System.out.println((int)c);//char에서 int로 변환
    }
}
