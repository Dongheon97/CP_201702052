import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
				
		System.out.println("������������ Ǯ�ڽ��ϱ�?");
		System.out.println("����ϰ� �ʹٸ� Y �Ǵ� y�� �Է��Ͻÿ� : ");
		
		char answer = myScanner.next().charAt(0);
		
		while (answer=='Y' || answer=='y') {
			System.out.println("������������ ����մϴ�!");
			System.out.println("");
			System.out.println("�ٽ� ������������ Ǯ�ڽ��ϱ�?");
			System.out.println("����ϰ� �ʹٸ� Y �Ǵ� y�� �Է��Ͻÿ� : ");
			answer = myScanner.next().charAt(0);
			
		}
		
		System.out.println("���������� ����� �����մϴ�.");
		myScanner.close();
	}
		
}
