import java.util.Scanner;

public class Program_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score_Korean, score_English, score_Computer;
		System.out.println("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ� :");
		System.out.print("- ���� ������ ������ �Է��ϼ��� : ");
		score_Korean = inputScore();
		System.out.print("- ���� ������ ������ �Է��ϼ��� : ");
		score_English = inputScore();
		System.out.print("- ��ǻ�� ������ ������ �Է��ϼ��� : ");
		score_Computer = inputScore();

		while (score_Korean >= 0 && score_English >= 0 && score_Computer >= 0) {
			if ((score_Korean > 100) || (score_English > 100) || (score_Computer > 100)) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴ� ���� �ֽ��ϴ�.");
			} 
			else {
				char grade_Korean = scoreToGrade(score_Korean);
				System.out.println(
						"[�� ��] ���� : " + score_Korean + ", ���� :" + scoreToGrade(score_Korean) + ", ���� : " + gradeToPoint(grade_Korean));
				char grade_English = scoreToGrade(score_English);
				System.out.println(
						"[�� ��] ���� : " + score_English + ", ���� :" + scoreToGrade(score_English) + ", ���� : " + gradeToPoint(grade_English));
				char grade_Computer = scoreToGrade(score_Computer);
				System.out.println("[��ǻ��] ���� : " + score_Computer + ", ���� :" + scoreToGrade(score_Computer) + ", ���� : "
						+ gradeToPoint(grade_Computer));
			}
			System.out.println("> �� ����(����, ����, ��ǻ��)�� ������ ���ʷ� �Է��մϴ� :");
			System.out.print("- ���� ������ ������ �Է��ϼ��� : ");
			score_Korean = inputScore();
			System.out.print("- ���� ������ ������ �Է��ϼ��� : ");
			score_English = inputScore();
			System.out.print("- ��ǻ�� ������ ������ �Է��ϼ��� : ");
			score_Computer = inputScore();
		}
		System.out.println("���� ������ �ԷµǾ� �Է��� �����մϴ�.");
		System.out.println("");
		System.out.println("���α׷��� �����մϴ�.");


	}
	

	private static int inputScore() {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		return score;
	}

	private static char scoreToGrade(int x) {
		if ((90 <= x) && (x <= 100)) {
			return 'A';
		} else if ((80 <= x) && (x < 90)) {
			return 'B';
		} else if ((70 <= x) && (x < 80)) {
			return 'C';
		} else if ((60 <= x) && (x < 70)) {
			return 'D';
		} else {
			return 'F';
		}
	}

	private static double gradeToPoint(char grade) {
		if (grade == 'A') {
			return 4.0;
		}
		if (grade == 'B') {
			return 3.0;
		}
		if (grade == 'C') {
			return 2.0;
		}
		if (grade == 'D') {
			return 1.0;
		} else {
			return 0.0;
		}
	}
}