import java.util.Scanner;

public class Program_6_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
		System.out.println("���� ���� (�����Ϸ��� ����)�� �Է��ϼ��� : ");
		int givenN = myScanner.nextInt();
		
		while( givenN >= 0) {
	
			printAsterisks(givenN);
			System.out.println("");
			System.out.println("���� ���� (�����Ϸ��� ����)�� �Է��ϼ��� : ");
			givenN = myScanner.nextInt();
		}
		
		System.out.println("");
		System.out.println("<<���� ���� ���� ���� ������ ����ϴ� ���α׷��� �����մϴ�>>");
		
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

	