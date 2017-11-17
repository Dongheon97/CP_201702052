import java.util.Scanner;

public class Program_8_3 {

	private static int MAX_SIZE = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] scoresOfKorean = new int[MAX_SIZE];
		int[] scoresOfComputer = new int[MAX_SIZE];
		int count = 0, sumOfScores=0;
		
		System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
		scoresOfKorean[count] = scanner.nextInt();
		scoresOfComputer[count] = scanner.nextInt();
		while ( (scoresOfKorean[count] >= 0) && (scoresOfComputer[count] >= 0) ) {
			if ((scoresOfKorean[count] > 100) || (scoresOfComputer[count] > 100)) {
				System.out.println("[오류] : 100 이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				sumOfScores = sumOfScores + scoresOfKorean[count] + scoresOfComputer[count];
				count ++;
			}
			System.out.print(">두 과목 (국어, 컴퓨터)의 점수를 차례로 입력하시오 : ");
			scoresOfKorean[count] = scanner.nextInt();
			scoresOfComputer[count] = scanner.nextInt();
		}
		
		double averageOfClass = (double) sumOfScores / (double) (count * 2.0);
		
		System.out.println("음의 정수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("모두 " + count + " 명의 성적이 입력되었습니다.");
		System.out.println("");
		System.out.println("입력된 성적과 개인 평균은 다음과 같습니다.");
		
		int n = 0, aboveAverage = 0;
		while (n < count) {
			double[] studentAverage = new double[MAX_SIZE];
			studentAverage[n] = (double) (scoresOfKorean[n] + scoresOfComputer[n]) / 2.0;
			if (studentAverage[n] >= averageOfClass) {
				System.out.print("[" + n + "] " + scoresOfKorean[n] + " " + scoresOfComputer[n]);
				System.out.println(" (평균 " + studentAverage[n] + ")");
				aboveAverage ++;
				n ++ ; 
			}
			else {
				System.out.print("[" + n + "] " + scoresOfKorean[n] + " " + scoresOfComputer[n]);
				System.out.println(" (평균 " + studentAverage[n] + ")");
				n ++ ;
			}
			
		}
		
		System.out.println("");
		System.out.println("학급 평균은 " + averageOfClass + " 입니다.");
		System.out.println("평균 이상인 학생의 수는 " + aboveAverage + " 명 입니다.");
		System.out.println("");
		System.out.println("프로그램을 종료합니다.");
		
		scanner.close();
	}

}
