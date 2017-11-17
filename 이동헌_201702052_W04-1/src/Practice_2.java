import java.util.Scanner;
public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		double a, b, c, x1, x2, determinant;
		
		System.out.println("이차방정식을 풀겠으면 'Y' 또는 'y'를 입력하시오 : ");
		char answer = myScanner.next().charAt(0);
		
		while(answer=='Y' || answer=='y') {
			System.out.println("a*x^2 + b*x = c");
			System.out.println("a값을 입력하시오. ");
			 a = myScanner.nextDouble();
				if ((a<0.0000001)&&(a>-0.0000001)) {
					System.out.println("오류; 이차항의 계수가 0이므로 이차방정식을 풀 수 없습니다.");
				}
				else {
					System.out.println("b값을 입력하시오. ");
					b = myScanner.nextDouble();
					
					System.out.println("c값을 입력하시오. ");
					c = myScanner.nextDouble();
			
					determinant = (b*b)-(4*a*c);
						if ((determinant<0)) {
							System.out.println("a=" + a + ", b=" + b + ", c=" + c);
							System.out.println("판별식의 값이 0보다 작으므로 실근이 존재하지 않습니다.");
						}
						else {
							x1 = (-b + Math.sqrt(determinant)) / (2*a);
							x2 = (-b - Math.sqrt(determinant)) / (2*a);
							System.out.println("a=" + a + ", b=" + b + ", c=" + c);
							System.out.println("The solution is " + x1 + " or " + x2 +".");
						}
				}
				
				System.out.println("");
				System.out.println("이차방정식을 다시 풀겠습니까?");
				System.out.println("풀겠으면  'Y' 또는 'y'를 입력하시오 :" );
				answer = myScanner.next().charAt(0);
			}
		System.out.println("프로그램을 종료합니다.");
		myScanner.close();
		
	}

}
