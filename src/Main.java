import java.util.Scanner;

public class Main{ 
    public int compare(int A,int B){
        if(A>B){
            System.out.println(">");
        
        }else if(A<B){
            System.out.println("<");
        }else{
            System.out.println("==");
        }

        return 0;
    }
public static void main(String[] args) {   
// - 테스트 케이스
// 1 2--> <
// 10 2 --> >
// 5 5 --> ==
//조건문 입력
Scanner sc =new Scanner(System.in);
int A,B;
A=sc.nextInt();
B=sc.nextInt();
//결과
Main main = new Main();
int soso = main.compare(A, B);
System.out.println(soso);

sc.close();
}
}