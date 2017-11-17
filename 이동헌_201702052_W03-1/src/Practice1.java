import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner=new Scanner(System.in);
		
		double a, b, c, x1, x2, determinant;
		
		System.out.println("a*x^2 + b*x = c");
		System.out.println("a값을 입력하시오. ");
		a = aScanner.nextDouble();
			if ((a<0.0000001)&&(a>-0.0000001)) {
				System.out.println("오류; 이차항의 계수가 0이므로 이차방정식을 풀 수 없습니다.");
		}
			else {
				System.out.println("b값을 입력하시오. ");
				b = aScanner.nextDouble();
				System.out.println("c값을 입력하시오. ");
				c = aScanner.nextDouble();
			
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
		
		aScanner.close();
			
	}

}
