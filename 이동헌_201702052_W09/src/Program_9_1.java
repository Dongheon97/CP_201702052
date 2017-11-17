import java.util.Scanner;

public class Program_9_1 {

	private static final int MAX_SIZE = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score ;
		int[] scores = new int[MAX_SIZE] ;
		int numberOfStudents = 0 ;
		double average ;
		
		System.out.print(">점수를 입력하시오 : ");
		score = inputScore();
		while (score >= 0) {
			if (score>100) {
				System.out.println("[오류] : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				scores[numberOfStudents] = score;
				numberOfStudents++;
			}
			System.out.print(">점수를 입력하시오 : ");
			score = inputScore();
		}
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("모두 " + numberOfStudents + " 명의 성적이 입력되었습니다.");
		average = calcAverage(scores, numberOfStudents);
		System.out.println("평균은 " + average + " 입니다.");
		System.out.println("");
		
		System.out.println("입력된 성적은 다음과 같습니다.");
		int n = 0;
		int aboveAverage = 0;
		while (n < numberOfStudents) {
			if ( scores[n] >= average) {
				System.out.println("[" + n + "] " + scores[n] + " (평균 이상입니다.)");
				n++ ;
				aboveAverage++ ;
			}
			else  {
				System.out.println("[" + n + "] " + scores[n] + " (평균 미만입니다.)");
				n++ ; 
			}
		}
		System.out.println("평균 이상인 학생의 수는 " + aboveAverage + " 명 입니다.");
		System.out.println("");
		System.out.println("최고점은 " + calcMax(scores, numberOfStudents) + " 점 입니다.");
		System.out.println("최저점은 " + calcMin(scores, numberOfStudents) + " 점 입니다.");
		System.out.println("");
		System.out.println("프로그램을 종료합니다.");
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
