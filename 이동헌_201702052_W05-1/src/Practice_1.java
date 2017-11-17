import java.util.Scanner;
public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner=new Scanner(System.in);
		
		int score;
		
		System.out.println("성적을 입력하시오 : ");
		score=myScanner.nextInt();
		
		while (score >= 0) {
			if (score > 100) {
				System.out.println("[오류] 최대점수 100을 넘었습니다. ");
			}
			else {	
			}
			System.out.println("성적을 입력하시오 : ");
			score=myScanner.nextInt();
		}
		System.out.println("프로그램을 종료합니다.");
		
		myScanner.close();
	}

}
