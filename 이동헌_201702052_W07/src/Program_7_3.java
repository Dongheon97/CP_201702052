import java.util.Scanner;

public class Program_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score_Korean, score_English, score_Computer;
		System.out.println("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다 :");
		System.out.print("- 국어 과목의 점수를 입력하세요 : ");
		score_Korean = inputScore();
		System.out.print("- 영어 과목의 점수를 입력하세요 : ");
		score_English = inputScore();
		System.out.print("- 컴퓨터 과목의 점수를 입력하세요 : ");
		score_Computer = inputScore();

		while (score_Korean >= 0 && score_English >= 0 && score_Computer >= 0) {
			if ((score_Korean > 100) || (score_English > 100) || (score_Computer > 100)) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닌 것이 있습니다.");
			} 
			else {
				char grade_Korean = scoreToGrade(score_Korean);
				System.out.println(
						"[국 어] 점수 : " + score_Korean + ", 학점 :" + scoreToGrade(score_Korean) + ", 평점 : " + gradeToPoint(grade_Korean));
				char grade_English = scoreToGrade(score_English);
				System.out.println(
						"[영 어] 점수 : " + score_English + ", 학점 :" + scoreToGrade(score_English) + ", 평점 : " + gradeToPoint(grade_English));
				char grade_Computer = scoreToGrade(score_Computer);
				System.out.println("[컴퓨터] 점수 : " + score_Computer + ", 학점 :" + scoreToGrade(score_Computer) + ", 평점 : "
						+ gradeToPoint(grade_Computer));
			}
			System.out.println("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력합니다 :");
			System.out.print("- 국어 과목의 점수를 입력하세요 : ");
			score_Korean = inputScore();
			System.out.print("- 영어 과목의 점수를 입력하세요 : ");
			score_English = inputScore();
			System.out.print("- 컴퓨터 과목의 점수를 입력하세요 : ");
			score_Computer = inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("프로그램을 종료합니다.");


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