import java.util.Scanner;

public class Program_8_1 {

	private static final int MAX_SIZE = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] scores = new int[MAX_SIZE];		
		int count = 0;
		
		System.out.print(">������ �Է��Ͻÿ� : ");
		scores[count] = scanner.nextInt();
		while (scores[count] >= 0) {
			if (scores[count] > 100 ) {
				System.out.println("[����] : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				count ++ ;
			}
			System.out.print(">������ �Է��Ͻÿ� : ");
			scores[count] = scanner.nextInt();

		}
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("��� " + count + "���� ������ �ԷµǾ����ϴ�.");
		System.out.println("");
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		
		int n = 0;
		while (n < count) {
			System.out.println("[" + n + "] " + scores[n] );
			n ++;
		}
		
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");
		scanner.close();
	}

}
