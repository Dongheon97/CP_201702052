import java.util.Scanner;

public class Program_8_2 {

	private static int MAX_SIZE = 100; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		int[] scores = new int[MAX_SIZE];
		int count = 0, sum = 0;
		
		System.out.print(">������ �Է��Ͻÿ� : ");
		scores[count] = scanner.nextInt();
		
		while (scores[count] >= 0) {
			if (scores[count] > 100) {
				System.out.println("[����] : 100 �� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				sum = sum + scores[count];
				count ++ ;
			}
			System.out.print(">������ �Է��Ͻÿ� : ");
			scores[count] = scanner.nextInt();
		}
		
		double average = (double) sum / (double) count;
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("��� " + count + " ���� ������ �ԷµǾ����ϴ�.");
		System.out.println("����� " + average + " �Դϴ�.");
		System.out.println("");
		System.out.println("�Էµ� ������ ������ �����ϴ�.");

		int n = 0, aboveAverage = 0;
		while (n < count) {
			if (scores[n] >= average) {
				System.out.println("[" + n + "] " + scores[n] + " (��� �̻��Դϴ�)");
				n ++;
				aboveAverage ++;
			}
			else {
				System.out.println("[" + n + "] " + scores[n] + " (��� �̸��Դϴ�)");
				n ++;
			}
		}
		System.out.println("��� �̻��� �л��� ���� " + aboveAverage + " �� �Դϴ�.");
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");
		
		scanner.close();
	}

}
