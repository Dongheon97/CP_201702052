import java.util.Scanner;
public class Practice_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		int score, numberOfStudents=0, sumOfScores=0;
		
		System.out.println("<<성적 처리 프로그램을 실행합니다>>");
		System.out.println("");
		System.out.println("성적을 입력하세요 : ");
		score = myScanner.nextInt();
		
		while (score>=0) {
			if (score > 100) {
				System.out.println("[오류] 최대 점수 100을 넘었습니다.");
			}
			else {
				numberOfStudents++;
				sumOfScores = sumOfScores + score;
			}
			System.out.println("성적을 입력하세요 : ");
			score = myScanner.nextInt();
		}
		System.out.println("");
		System.out.println("학생 수는 " + numberOfStudents + "명 입니다.");
		double average = (double) sumOfScores / (double)numberOfStudents;
		System.out.println("평균은 "+ average + "입니다.");
		System.out.println("");
		System.out.println("<<성적 처리 프로그램을 종료합니다>>");
		
		myScanner.close();
	}
		
}
