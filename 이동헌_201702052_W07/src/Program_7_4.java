import java.util.Scanner;

public class Program_7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score_Korean, score_English, score_Computer;
		int countA=0, countB=0, countC=0, countD=0, countF=0;
		
		System.out.println("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력하세요 : ");
		score_Korean = inputScore();
		score_English = inputScore();
		score_Computer = inputScore();
		
		while ( (score_Korean >= 0) && (score_English >= 0) && (score_English >= 0)) {
			if ((score_Korean > 100) || (score_English > 100) || (score_English > 100)) {
				System.out.println("[오류] : 100이 넘어서, 정상적인 점수가 아닙니다.");	
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
				
				System.out.println("[국 어] 점수 : " + score_Korean + " , 학점 : " + grade_Korean + ", 평점 : " + point_Korean);
				System.out.println("[영 어] 점수 : " + score_English + " , 학점 : " + grade_English + ", 평점 : " + point_English);
				System.out.println("[컴퓨터] 점수 : " + score_Computer + " , 학점 : " + grade_Computer + ", 평점 : " + point_Computer);
				System.out.println("이 학생의 평균 평점은 " + gpa + "입니다.");
				
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
			System.out.print("> 세 과목(국어, 영어, 컴퓨터)의 점수를 차례로 입력하세요 : ");
			score_Korean = inputScore();
			score_English = inputScore();
			score_Computer = inputScore();
		}
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("평균 평점이 4.0 이상인 학생은 " + countA + "명 입니다.");
		System.out.println("평균 평점이 3.0 이상 4.0 미만인 학생은 " + countB + "명 입니다.");
		System.out.println("평균 평점이 2.0 이상 3.0 미만인 학생은 " + countC + "명 입니다.");
		System.out.println("평균 평점이 1.0 이상 2.0 미만인 학생은 " + countD + "명 입니다.");
		System.out.println("평균 평점이 0.0 이상 1.0 미만인 학생은 " + countF + "명 입니다.");
		System.out.println("");
		System.out.println("프로그램을 종료합니다.");
		
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
