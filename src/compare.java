import java.util.Scanner;

public class compare{ 
public static void main(String[] args) {   
// - 테스트 케이스
// 1 2--> <
// 10 2 --> >
// 5 5 --> ==
Scanner sc =new Scanner(System.in);
int A,B;
A=sc.nextInt();
B=sc.nextInt();
if(A>B){
    System.out.println(">");

}else if(A<B){
    System.out.println("<");
}else{
    System.out.println("==");
}
sc.close();
}
}
