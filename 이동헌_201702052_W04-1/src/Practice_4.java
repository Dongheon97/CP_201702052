import java.util.Scanner;
public class Practice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner = new Scanner(System.in);
		
		int givenN;
		
		System.out.println("Factorial(N!)�� ����ϰ��� �մϴ�.");
		System.out.println("����ϰ� ������ 'Y' �Ǵ� 'y'�� �Է��ϼ��� : ");
		char answer = myScanner.next().charAt(0);
		
		while(answer == 'Y' || answer == 'y') {
			System.out.println("N���� �Է��Ͻÿ� : ");
			givenN = myScanner.nextInt();
		
				if(givenN<0) {
					System.out.println("����; N�� ���� �����̹Ƿ� ���α׷��� �����մϴ�.");
				}
				else {
					System.out.println(givenN + "!�� ���� ����մϴ�!");
					}
			System.out.println("");
			System.out.println("Factortial(N!)�� ���� ����ϰ� ������ 'Y' �Ǵ� 'y'�� �Է��ϼ���.");
			answer = myScanner.next().charAt(0);
		}
		System.out.println("���α׷��� �����մϴ�.");
		myScanner.close();
	}
}