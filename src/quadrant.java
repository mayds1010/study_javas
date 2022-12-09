import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class quadrant {
    public static void main(String[] args) throws IOException{
        //좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수(제1사분면)
        //점 B는 x좌표가 음수이고 y좌표가 양수(제2사분면)
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());//(−1000 ≤ x ≤ 1000; x ≠ 0)
        int y = Integer.parseInt(br.readLine());//(−1000 ≤ y ≤ 1000; y ≠ 0)
   
        if(x>0&&y>0)
            System.out.println(1);
          else if(x<0&&y>0)
          System.out.println(2);
          else if(x<0&&y<0)
          System.out.println(3);
          else{
            System.out.println(4);
          }
          br.close();
        }
    }

