import java.util.Scanner;

public class Program_6_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 실행합니다>>");
		System.out.println("양의 정수 (종료하려면 음수)를 입력하세요 : ");
		int givenN = myScanner.nextInt();
		
		while( givenN >= 0) {
	
			printAsterisks(givenN);
			System.out.println("");
			System.out.println("양의 정수 (종료하려면 음수)를 입력하세요 : ");
			givenN = myScanner.nextInt();
		}
		
		System.out.println("");
		System.out.println("<<양의 정수 값을 별의 개수로 출력하는 프로그램을 종료합니다>>");
		
		myScanner.close();
	}
	
	private static void printAsterisks(int n) {
		if (n>=0) {
			int count = 0;
			
			while (count<n) {
				System.out.print("*");
				count++;
			}
		}
	}
}

	