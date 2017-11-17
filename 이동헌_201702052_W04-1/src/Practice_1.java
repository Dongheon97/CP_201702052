import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
				
		System.out.println("이차방정식을 풀겠습니까?");
		System.out.println("계산하고 싶다면 Y 또는 y를 입력하시오 : ");
		
		char answer = myScanner.next().charAt(0);
		
		while (answer=='Y' || answer=='y') {
			System.out.println("이차방정식을 계산합니다!");
			System.out.println("");
			System.out.println("다시 이차방정식을 풀겠습니까?");
			System.out.println("계산하고 싶다면 Y 또는 y를 입력하시오 : ");
			answer = myScanner.next().charAt(0);
			
		}
		
		System.out.println("이차방정식 계산을 종료합니다.");
		myScanner.close();
	}
		
}
