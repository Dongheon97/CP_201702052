import java.util.Scanner;

public class Program_8_2 {

	private static int MAX_SIZE = 100; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		int[] scores = new int[MAX_SIZE];
		int count = 0, sum = 0;
		
		System.out.print(">점수를 입력하시오 : ");
		scores[count] = scanner.nextInt();
		
		while (scores[count] >= 0) {
			if (scores[count] > 100) {
				System.out.println("[오류] : 100 을 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				sum = sum + scores[count];
				count ++ ;
			}
			System.out.print(">점수를 입력하시오 : ");
			scores[count] = scanner.nextInt();
		}
		
		double average = (double) sum / (double) count;
		
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("모두 " + count + " 명의 성적이 입력되었습니다.");
		System.out.println("평균은 " + average + " 입니다.");
		System.out.println("");
		System.out.println("입력된 성적은 다음과 같습니다.");

		int n = 0, aboveAverage = 0;
		while (n < count) {
			if (scores[n] >= average) {
				System.out.println("[" + n + "] " + scores[n] + " (평균 이상입니다)");
				n ++;
				aboveAverage ++;
			}
			else {
				System.out.println("[" + n + "] " + scores[n] + " (평균 미만입니다)");
				n ++;
			}
		}
		System.out.println("평균 이상인 학생의 수는 " + aboveAverage + " 명 입니다.");
		System.out.println("");
		System.out.println("프로그램을 종료합니다.");
		
		scanner.close();
	}

}
