import java.util.Scanner;

public class Program_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  numberOfA=0, numberOfB=0, numberOfC=0, numberOfD=0, numberOfF=0;
		
		int currentScore;
		
		currentScore = inputScore();
		while (currentScore > 0) {
			if (currentScore > 100) {
				System.out.println("���� : 100�� �Ѿ, �������� ������ �ƴմϴ�.");
			}
			else {
				System.out.println("���� : " + currentScore + ", ���� : " + scoreToGrade(currentScore));
				char grade = scoreToGrade(currentScore);
				
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
		System.out.println("���� ������ �ԷµǾ� ���α׷��� �����մϴ�.");
		System.out.println("");
		System.out.println("A�� " + numberOfA + "�� �Դϴ�.");
		System.out.println("A�� " + numberOfB + "�� �Դϴ�.");
		System.out.println("A�� " + numberOfC + "�� �Դϴ�.");
		System.out.println("A�� " + numberOfD + "�� �Դϴ�.");
		System.out.println("A�� " + numberOfF + "�� �Դϴ�.");
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	private static int inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("-������ �Է��ϼ��� : ");
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
}
