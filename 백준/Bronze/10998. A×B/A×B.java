import java.util.Scanner; //Scanner를 치고 엔터를 누르면 자동 생성되는 줄

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Scanner 생성자
		// System.in 입력 스트림이다. 입력할 때 필요한 코드
		int a,b; //a, b 선언
		a= sc.nextInt(); // 입력스트림에서 입력받은값을 a에 저장
		// nextInt() : sc에 있는 함수
		b= sc.nextInt(); // nextInt()로 저장받은 입력스트림을 b에 저장
		System.out.println(a*b); //a*b 출력
	}
}