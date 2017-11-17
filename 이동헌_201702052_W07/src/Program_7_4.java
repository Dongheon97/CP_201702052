import java.util.Scanner;

public class Program_7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score_Korean, score_English, score_Computer;
		int countA=0, countB=0, countC=0, countD=0, countF=0;
		
		System.out.println("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��ϼ��� : ");
		score_Korean = inputScore();
		score_English = inputScore();
		score_Computer = inputScore();
		
		while ( (score_Korean >= 0) && (score_English >= 0) && (score_English >= 0)) {
			if ((score_Korean > 100) || (score_English > 100) || (score_English > 100)) {
				System.out.println("[����] : 100�� �Ѿ, �������� ������ �ƴմϴ�.");	
			}
			else {
				char grade_Korean, grade_English, grade_Computer;
				double point_Korean, point_English, point_Computer, gpa;
				
				grade_Korean = scoreToGrade(score_Korean);
				grade_English = scoreToGrade(score_English);
				grade_Computer = scoreToGrade(score_Computer);
				point_Korean = gradeToPoint(grade_Korean);
				point_English = gradeToPoint(grade_English);
				point_Computer = gradeToPoint(grade_Computer);
				gpa = gpa(point_Korean, point_English, point_Computer);
				
				System.out.println("[�� ��] ���� : " + score_Korean + " , ���� : " + grade_Korean + ", ���� : " + point_Korean);
				System.out.println("[�� ��] ���� : " + score_English + " , ���� : " + grade_English + ", ���� : " + point_English);
				System.out.println("[��ǻ��] ���� : " + score_Computer + " , ���� : " + grade_Computer + ", ���� : " + point_Computer);
				System.out.println("�� �л��� ��� ������ " + gpa + "�Դϴ�.");
				
				if (gpa >= 4.0) {
					countA++;
				}
				else if( (3.0 <= gpa) && (gpa < 4.0)) {
					countB++;
				}
				else if( (2.0 <= gpa) && (gpa < 3.0)) {
					countC++;
				}
				else if( (1.0 <= gpa) && (gpa < 2.0)) {
					countD++;
				}
				else {
					countF++;
				}
			}
			System.out.print("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��ϼ��� : ");
			score_Korean = inputScore();
			score_English = inputScore();
			score_Computer = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("��� ������ 4.0 �̻��� �л��� " + countA + "�� �Դϴ�.");
		System.out.println("��� ������ 3.0 �̻� 4.0 �̸��� �л��� " + countB + "�� �Դϴ�.");
		System.out.println("��� ������ 2.0 �̻� 3.0 �̸��� �л��� " + countC + "�� �Դϴ�.");
		System.out.println("��� ������ 1.0 �̻� 2.0 �̸��� �л��� " + countD + "�� �Դϴ�.");
		System.out.println("��� ������ 0.0 �̻� 1.0 �̸��� �л��� " + countF + "�� �Դϴ�.");
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	
	private static int inputScore() {
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		return score;
	}
	
	private static char scoreToGrade(int x) {
		if ( (90 <= x) && (x <= 100)) {
			return 'A';
		}
		else if ( (80 <= x) && (x < 90)) {
			return 'B';
		}
		else if ( (70 <= x) && (x < 80)) {
			return 'C';
		}
		else if ( (60 <= x) && (x < 70)) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
	
	private static double gradeToPoint(char grade) {
		if ( grade =='A') {
			return 4.0;
		}
		else if ( grade =='B') {
			return 3.0;
		}
		else if (  grade =='C') {
			return 2.0;
		}
		else if (  grade =='D') {
			return 1.0;
		}
		else {
			return 0.0;
		}
	}
	private static double gpa (double a, double b, double c) {
		double gpa = (a + b + c) / 3.0;
		return gpa;
	}
}
