import java.util.Scanner;

public class Program_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  numberOfA=0, numberOfB=0, numberOfC=0, numberOfD=0, numberOfF=0;
		
		int currentScore;
		
		currentScore = inputScore();
		while (currentScore > 0) {
			if (currentScore > 100) {
				System.out.println("오류 : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				char grade = scoreToGrade(currentScore);
				System.out.println("점수 : " + currentScore + ", 학점 : " + scoreToGrade(currentScore) + ", 평점 : " + gradeToPoint(grade));
								
				if (grade == 'A') {
					numberOfA ++;
				}
				else if(grade =='B') {
					numberOfB ++;
				}
				else if(grade =='C') {
					numberOfC ++;
				}
				else if(grade =='D') {
					numberOfD ++;
				}
				else if(grade =='F') {
					numberOfF ++;
				}
			}
			currentScore = inputScore();
		}
		System.out.println("음의 정수가 입력되어 프로그램을 종료합니다.");
		System.out.println("");
		System.out.println("A는 " + numberOfA + "명 입니다.");
		System.out.println("B는 " + numberOfB + "명 입니다.");
		System.out.println("C는 " + numberOfC + "명 입니다.");
		System.out.println("D는 " + numberOfD + "명 입니다.");
		System.out.println("F는 " + numberOfF + "명 입니다.");
		System.out.println("프로그램을 종료합니다.");
	}
	
	private static int inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("-점수를 입력하세요 : ");
		int score = scanner.nextInt();
		return score;
		
	}
	
	private static char scoreToGrade(int x) {

		if ( (90 <= x) && (x <= 100)) {
			return 'A';
		}
		else if ( (80 <= x) && (x < 90 )) {
			return 'B';
		}
		else if ( (70 <= x) && (x < 80)) {
			return 'C';
		}
		else if ( (60 <= x) && (x < 70)) {
			return 'D';
		}
		else  {
			return 'F';
		}
		
	}
	
	private static double gradeToPoint(char grade) {
		if ( grade == 'A') {
			return 4.0;
		}
		else if ( grade == 'B') {
			return 3.0;
		}
		else if ( grade == 'C') {
			return 2.0;
		}
		else if ( grade == 'D') {
			return 1.0;
		}
		else {
			return 0.0;
		}
	}
}
