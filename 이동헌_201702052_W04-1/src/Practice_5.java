import java.util.Scanner;
public class Practice_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		
		int givenN, count=2, fact=1;
		
		System.out.println("Factorial(N!)을 계산하고자 합니다.");
		System.out.println("계산하고 싶으면 'Y' 또는 'y'를 입력하시오 : ");
		char answer = myScanner.next().charAt(0);
		
		while(answer == 'Y' || answer == 'y') {
			System.out.println("N값을 입력하시오 : ");
			givenN = myScanner.nextInt();
		
			if(givenN<0) {
				System.out.println("오류; N의 값이 음수이므로 프로그램을 종료합니다.");
			}
			else {
				if(givenN==0) {
					fact = 1;
					System.out.println("계산한 값은 " + fact + "입니다.");
				}
				else {
					fact = 1;
					count = 2;
					while(count <= givenN) {
				
						fact = fact*count;
				
						count = count + 1;
						}
					System.out.println("계산한 값은 " + fact + "입니다.");
				}
			}
			System.out.println("");
			System.out.println("Factortial(N!)의 값을 계산하고 싶으면 'Y' 또는 'y'를 입력하세요.");
			answer = myScanner.next().charAt(0);
		}
		System.out.println("프로그램을 종료합니다.");
		myScanner.close();
	}
}