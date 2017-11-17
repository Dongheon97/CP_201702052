import java.util.Scanner;

public class Program_9_2 {

	private static final int MAX_SIZE=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		int numberOfStudents = 0;
		int[] scores = new int[MAX_SIZE];
		double average;
		
		System.out.print(">������ �Է��ϼ��� : ");
		score = inputScore();
		while (score >= 0) {
			if (score > 100) {
				System.out.println("[����] : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				scores[numberOfStudents] = score;
				numberOfStudents++ ;				
			}
			System.out.print(">������ �Է��ϼ��� : ");
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
		int aboveStudent = 0;
		while ( n < numberOfStudents ) {
			if ( scores[n] >= average ) {
				System.out.println("[" + n + "] " + scores[n] + " (��� �̻��Դϴ�.)");
				n++ ;
				aboveStudent++ ;
			}
			else {
				System.out.println("[" + n + "] " + scores[n] + " (��� �̸��Դϴ�.)");
				n++ ;
			}
		}
		System.out.println("��� �̻��� �л��� ���� " + aboveStudent + " �� �Դϴ�.");
		System.out.println("");
		System.out.println("�ְ����� " + calcMax(scores, numberOfStudents) + " �� �Դϴ�.");
		System.out.println("�������� " + calcMin(scores, numberOfStudents) + " �� �Դϴ�.");
		System.out.println("");
		
		System.out.println("�������� ������ �����ϴ�.");
		selectionSort(scores, numberOfStudents);
		int k = 0 ;
		while ( k < numberOfStudents) {
			System.out.println("[" + k + "] " + scores[k] );
			k++;
			
		}
	}
	
	private static int inputScore() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		return x;
	}
	
	private static double calcAverage(int[] elements, int aSize) {
		int i = 0;
		int sum = 0;
		double average;
		while ( i < aSize ) {
			sum = sum + elements[i];
			i++;
		}
		average = (double) sum / (double) aSize ;
		return average;
	}
	
	private static int calcMax(int[] elements, int aSize) {
		int max = elements[0];
		int i = 1;
		while ( i < aSize ) {
			if ( max < elements[i] ) {
				max = elements[i];
				
			}
			i ++ ;
		}
		return max;
	}
	
	private static int calcMin(int[] elements, int aSize) {
		int min = elements[0];
		int i = 1;
		while ( i < aSize ) {
			if ( min > elements[i] ) {
				min = elements[i];
				
			}
			i ++;
		}
		return min;
	}
	
	private static void selectionSort (int[] elements, int aSize) {
		int lastLoc = aSize-1 ;
		int maxLoc ;
		int curLoc ;
		int selectionLoc = 0 ;
		int maxValue ;
		
		while (selectionLoc < lastLoc) {
			maxLoc = selectionLoc;
			maxValue = elements[maxLoc];
			curLoc = selectionLoc + 1;
			while (curLoc <= lastLoc) {
				if (elements[curLoc] > maxValue) {
					maxLoc = curLoc;
					maxValue = elements[maxLoc];
				}
				curLoc++;
			}
			elements[maxLoc] = elements[selectionLoc];
			elements[selectionLoc] = maxValue;
			selectionLoc++;
		}
	}
}
