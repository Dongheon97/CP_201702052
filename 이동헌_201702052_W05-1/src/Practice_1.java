import java.util.Scanner;
public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		
		int score;
		
		System.out.println("������ �Է��Ͻÿ� : ");
		score=myScanner.nextInt();
		
		while (score >= 0) {
			if (score > 100) {
				System.out.println("[����] �ִ����� 100�� �Ѿ����ϴ�. ");
			}
			else {	
			}
			System.out.println("������ �Է��Ͻÿ� : ");
			score=myScanner.nextInt();
		}
		System.out.println("���α׷��� �����մϴ�.");
		
		myScanner.close();
	}

}
