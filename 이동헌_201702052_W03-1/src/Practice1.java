import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner aScanner=new Scanner(System.in);
		
		double a, b, c, x1, x2, determinant;
		
		System.out.println("a*x^2 + b*x = c");
		System.out.println("a���� �Է��Ͻÿ�. ");
		a = aScanner.nextDouble();
			if ((a<0.0000001)&&(a>-0.0000001)) {
				System.out.println("����; �������� ����� 0�̹Ƿ� ������������ Ǯ �� �����ϴ�.");
		}
			else {
				System.out.println("b���� �Է��Ͻÿ�. ");
				b = aScanner.nextDouble();
				System.out.println("c���� �Է��Ͻÿ�. ");
				c = aScanner.nextDouble();
			
				determinant = (b*b)-(4*a*c);
					if ((determinant<0)) {
						System.out.println("a=" + a + ", b=" + b + ", c=" + c);
						System.out.println("�Ǻ����� ���� 0���� �����Ƿ� �Ǳ��� �������� �ʽ��ϴ�.");
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
