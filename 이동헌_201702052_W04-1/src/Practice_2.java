import java.util.Scanner;
public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		double a, b, c, x1, x2, determinant;
		
		System.out.println("������������ Ǯ������ 'Y' �Ǵ� 'y'�� �Է��Ͻÿ� : ");
		char answer = myScanner.next().charAt(0);
		
		while(answer=='Y' || answer=='y') {
			System.out.println("a*x^2 + b*x = c");
			System.out.println("a���� �Է��Ͻÿ�. ");
			 a = myScanner.nextDouble();
				if ((a<0.0000001)&&(a>-0.0000001)) {
					System.out.println("����; �������� ����� 0�̹Ƿ� ������������ Ǯ �� �����ϴ�.");
				}
				else {
					System.out.println("b���� �Է��Ͻÿ�. ");
					b = myScanner.nextDouble();
					
					System.out.println("c���� �Է��Ͻÿ�. ");
					c = myScanner.nextDouble();
			
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
				
				System.out.println("");
				System.out.println("������������ �ٽ� Ǯ�ڽ��ϱ�?");
				System.out.println("Ǯ������  'Y' �Ǵ� 'y'�� �Է��Ͻÿ� :" );
				answer = myScanner.next().charAt(0);
			}
		System.out.println("���α׷��� �����մϴ�.");
		myScanner.close();
		
	}

}
