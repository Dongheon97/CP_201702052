import java.util.Scanner;
public class Program_6_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
		int givenN = inputNumber();
		
		while (givenN>=0) {
			printAsterisks(givenN);
			System.out.println("");
			
			givenN = inputNumber();
		}
		System.out.println("");
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
	}
	private static void printAsterisks(int n) {
		if (n>=0) {
			int count=0 ;
			
			while(count<n) {
				System.out.print("*");
				count++;
			}
		}	
	}
	private static int inputNumber() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���� ���� (�����Ϸ��� ����)�� �Է��ϼ��� : ");
		int inputNumber = myScanner.nextInt();
		
		return inputNumber;
	}
}