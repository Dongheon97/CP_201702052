import java.util.Scanner;
public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		int score, numberOfStudents=0, sumOfScores=0;
		
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		System.out.println("");
		System.out.println("������ �Է��ϼ��� : ");
		score = myScanner.nextInt();
		
		while (score>=0) {
			if (score > 100) {
				System.out.println("[����] �ִ� ���� 100�� �Ѿ����ϴ�.");
			}
			else {
				numberOfStudents++;
				sumOfScores = sumOfScores + score;
			}
			System.out.println("������ �Է��ϼ��� : ");
			score = myScanner.nextInt();
		}
		System.out.println("");
		System.out.println("�л� ���� " + numberOfStudents + "�� �Դϴ�.");
		double average = (double) sumOfScores / (double)numberOfStudents;
		System.out.println("����� "+ average + "�Դϴ�.");
		System.out.println("");
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		
		myScanner.close();
	}
		
}
