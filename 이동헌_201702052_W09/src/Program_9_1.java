import java.util.Scanner;

public class Program_9_1 {

	private static final int MAX_SIZE = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score ;
		int[] scores = new int[MAX_SIZE] ;
		int numberOfStudents = 0 ;
		double average ;
		
		System.out.print(">������ �Է��Ͻÿ� : ");
		score = inputScore();
		while (score >= 0) {
			if (score>100) {
				System.out.println("[����] : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scores[numberOfStudents] = score;
				numberOfStudents++;
			}
			System.out.print(">������ �Է��Ͻÿ� : ");
			score = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("��� " + numberOfStudents + " ���� ������ �ԷµǾ����ϴ�.");
		average = calcAverage(scores, numberOfStudents);
		System.out.println("����� " + average + " �Դϴ�.");
		System.out.println("");
		
		System.out.println("�Էµ� ������ ������ �����ϴ�.");
		int n = 0;
		int aboveAverage = 0;
		while (n < numberOfStudents) {
			if ( scores[n] >= average) {
				System.out.println("[" + n + "] " + scores[n] + " (��� �̻��Դϴ�.)");
				n++ ;
				aboveAverage++ ;
			}
			else  {
				System.out.println("[" + n + "] " + scores[n] + " (��� �̸��Դϴ�.)");
				n++ ; 
			}
		}
		System.out.println("��� �̻��� �л��� ���� " + aboveAverage + " �� �Դϴ�.");
		System.out.println("");
		System.out.println("�ְ����� " + calcMax(scores, numberOfStudents) + " �� �Դϴ�.");
		System.out.println("�������� " + calcMin(scores, numberOfStudents) + " �� �Դϴ�.");
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");
	}

	private static int inputScore() {
		int x;
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();	
		return x ;
	}
	
	private static double calcAverage(int[] elements, int aSize) {
		int i ;
		int sum;
		double average;
		i = 0;
		sum = 0;
		while (i < aSize) {
			sum = sum + elements[i];
			i++ ;
		}
		average = (double) sum / (double) i;
		return average;
	}
	
	private static int calcMax (int[] elements, int aSize) {
		int max = elements[0];
		int i = 1;
		while (i < aSize) {
			if ( max < elements[i] ) {
				max = elements[i];
			}
			i++ ;
		}
		return max;
	}
	
	private static int calcMin (int[] elements, int aSize) {
		int min = elements[0];
		int i = 1;
		while (i < aSize) {
			if ( min > elements[i] ) {
				min = elements[i];
			}
			i++ ;
		}
		return min;
	}
}
