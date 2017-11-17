import java.util.Scanner;

public class Program_8_3 {

	private static int MAX_SIZE = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] scoresOfKorean = new int[MAX_SIZE];
		int[] scoresOfComputer = new int[MAX_SIZE];
		int count = 0, sumOfScores=0;
		
		System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
		scoresOfKorean[count] = scanner.nextInt();
		scoresOfComputer[count] = scanner.nextInt();
		while ( (scoresOfKorean[count] >= 0) && (scoresOfComputer[count] >= 0) ) {
			if ((scoresOfKorean[count] > 100) || (scoresOfComputer[count] > 100)) {
				System.out.println("[����] : 100 �� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				sumOfScores = sumOfScores + scoresOfKorean[count] + scoresOfComputer[count];
				count ++;
			}
			System.out.print(">�� ���� (����, ��ǻ��)�� ������ ���ʷ� �Է��Ͻÿ� : ");
			scoresOfKorean[count] = scanner.nextInt();
			scoresOfComputer[count] = scanner.nextInt();
		}
		
		double averageOfClass = (double) sumOfScores / (double) (count * 2.0);
		
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("��� " + count + " ���� ������ �ԷµǾ����ϴ�.");
		System.out.println("");
		System.out.println("�Էµ� ������ ���� ����� ������ �����ϴ�.");
		
		int n = 0, aboveAverage = 0;
		while (n < count) {
			double[] studentAverage = new double[MAX_SIZE];
			studentAverage[n] = (double) (scoresOfKorean[n] + scoresOfComputer[n]) / 2.0;
			if (studentAverage[n] >= averageOfClass) {
				System.out.print("[" + n + "] " + scoresOfKorean[n] + " " + scoresOfComputer[n]);
				System.out.println(" (��� " + studentAverage[n] + ")");
				aboveAverage ++;
				n ++ ; 
			}
			else {
				System.out.print("[" + n + "] " + scoresOfKorean[n] + " " + scoresOfComputer[n]);
				System.out.println(" (��� " + studentAverage[n] + ")");
				n ++ ;
			}
			
		}
		
		System.out.println("");
		System.out.println("�б� ����� " + averageOfClass + " �Դϴ�.");
		System.out.println("��� �̻��� �л��� ���� " + aboveAverage + " �� �Դϴ�.");
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");
		
		scanner.close();
	}

}
