import java.util.Scanner;
public class Practice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		int score, numberOfA=0, numberOfB=0, numberOfC=0, numberOfD=0, numberOfF=0, numberOfStudents=0, sumOfScores=0;
		char grade;
		
		System.out.println("<<성적 처리 프로그램을 시작합니다>>");
		System.out.println("");
		System.out.println("성적을 입력하세요 : ");
		score = myScanner.nextInt();
		
		while (score >= 0) {
			if (score > 100) {
				System.out.println("[오류] 최대 점수 100을 넘었습니다.");
			}
			else if (score <= 100 && score >= 90) {
				grade = 'A';
				System.out.println("성적 : " + score + " " + "학점 : " + grade);
				numberOfA++ ;
				sumOfScores = sumOfScores + score;
				numberOfStudents++;
			}
			else if (score <= 89 && score >= 80) {
				grade = 'B';
				System.out.println("성적 : " + score + " " + "학점 : " + grade);
				numberOfB++ ;
				sumOfScores = sumOfScores + score;
				numberOfStudents++;
			}
			else if (score <= 79 && score >= 70) {
				grade = 'C';
				System.out.println("성적 : " + score + " " + "학점 : " + grade);
				numberOfC++ ;
				sumOfScores = sumOfScores + score;
				numberOfStudents++;
			}
			else if (score <= 69 && score >= 60) {
				grade = 'D';
				System.out.println("성적 : " + score + " " + "학점 : " + grade);
				numberOfD++ ;
				sumOfScores = sumOfScores + score;
				numberOfStudents++;
			}
			else {
				grade = 'F';
				System.out.println("성적 : " + score + " " + "학점 : " + grade);
				numberOfF++ ;
				sumOfScores = sumOfScores + score;
				numberOfStudents++;
			}
			System.out.println("");
			System.out.println("성적을 입력하세요 : ");
			score = myScanner.nextInt();
			
		}
		System.out.println("");
		System.out.println("학생 수는 "+ numberOfStudents +"명 입니다.");
		System.out.println("A는 " + numberOfA + "명 입니다.");
		System.out.println("B는 " + numberOfB + "명 입니다.");
		System.out.println("C는 " + numberOfC + "명 입니다.");
		System.out.println("D는 " + numberOfD + "명 입니다.");
		System.out.println("F는 " + numberOfF + "명 입니다.");
		double average = (double) sumOfScores / (double) numberOfStudents;
		System.out.println("평균은 "+ average +"입니다.");
		System.out.println("");
		System.out.println("<<성적 처리 프로그램을 종료합니다>>");
		
		myScanner.close();		
	}

}