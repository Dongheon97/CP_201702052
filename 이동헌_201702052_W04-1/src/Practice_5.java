import java.util.Scanner;
public class Practice_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		
		int givenN, count=2, fact=1;
		
		System.out.println("Factorial(N!)�� ����ϰ��� �մϴ�.");
		System.out.println("����ϰ� ������ 'Y' �Ǵ� 'y'�� �Է��Ͻÿ� : ");
		char answer = myScanner.next().charAt(0);
		
		while(answer == 'Y' || answer == 'y') {
			System.out.println("N���� �Է��Ͻÿ� : ");
			givenN = myScanner.nextInt();
		
			if(givenN<0) {
				System.out.println("����; N�� ���� �����̹Ƿ� ���α׷��� �����մϴ�.");
			}
			else {
				if(givenN==0) {
					fact = 1;
					System.out.println("����� ���� " + fact + "�Դϴ�.");
				}
				else {
					fact = 1;
					count = 2;
					while(count <= givenN) {
				
						fact = fact*count;
				
						count = count + 1;
						}
					System.out.println("����� ���� " + fact + "�Դϴ�.");
				}
			}
			System.out.println("");
			System.out.println("Factortial(N!)�� ���� ����ϰ� ������ 'Y' �Ǵ� 'y'�� �Է��ϼ���.");
			answer = myScanner.next().charAt(0);
		}
		System.out.println("���α׷��� �����մϴ�.");
		myScanner.close();
	}
}