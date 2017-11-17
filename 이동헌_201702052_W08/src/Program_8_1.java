import java.util.Scanner;

public class Program_8_1 {

	private static final int MAX_SIZE = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int[] scores = new int[MAX_SIZE];		
		int count = 0;
		
		System.out.print(">점수를 입력하시오 : ");
		scores[count] = scanner.nextInt();
		while (scores[count] >= 0) {
			if (scores[count] > 100 ) {
				System.out.println("[오류] : 100이 넘어서, 정상적인 점수가 아닙니다.");
			}
			else {
				count ++ ;
			}
			System.out.print(">점수를 입력하시오 : ");
			scores[count] = scanner.nextInt();

		}
		
		System.out.println("음의 점수가 입력되어 입력을 종료합니다.");
		System.out.println("");
		System.out.println("모두 " + count + "명의 성적이 입력되었습니다.");
		System.out.println("");
		System.out.println("입력된 성적은 다음과 같습니다.");
		
		int n = 0;
		while (n < count) {
			System.out.println("[" + n + "] " + scores[n] );
			n ++;
		}
		
		System.out.println("");
		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}

}
