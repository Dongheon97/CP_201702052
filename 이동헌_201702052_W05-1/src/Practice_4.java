import java.util.Scanner;
public class Practice_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
		
		int score, numberOfA=0, numberOfB=0, numberOfC=0, numberOfD=0, numberOfF=0, numberOfStudents=0, sumOfScores=0;
		char grade;
		
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		System.out.println("");
		System.out.println("������ �Է��ϼ��� : ");
		score = myScanner.nextInt();
		
		while (score >= 0) {
			if (score > 100) {
				System.out.println("[����] �ִ� ���� 100�� �Ѿ����ϴ�.");
			}
			else if (score <= 100 && score >= 90) {
				grade = 'A';
				System.out.println("���� : " + score + " " + "���� : " + grade);
				numberOfA++ ;
				sumOfScores = sumOfScores + score;
				numberOfStudents++;
			}
			else if (score <= 89 && score >= 80) {
				grade = 'B';
				System.out.println("���� : " + score + " " + "���� : " + grade);
				numberOfB++ ;
				sumOfScores = sumOfScores + score;
				numberOfStudents++;
			}
			else if (score <= 79 && score >= 70) {
				grade = 'C';
				System.out.println("���� : " + score + " " + "���� : " + grade);
				numberOfC++ ;
				sumOfScores = sumOfScores + score;
				numberOfStudents++;
			}
			else if (score <= 69 && score >= 60) {
				grade = 'D';
				System.out.println("���� : " + score + " " + "���� : " + grade);
				numberOfD++ ;
				sumOfScores = sumOfScores + score;
				numberOfStudents++;
			}
			else {
				grade = 'F';
				System.out.println("���� : " + score + " " + "���� : " + grade);
				numberOfF++ ;
				sumOfScores = sumOfScores + score;
				numberOfStudents++;
			}
			System.out.println("");
			System.out.println("������ �Է��ϼ��� : ");
			score = myScanner.nextInt();
			
		}
		System.out.println("");
		System.out.println("�л� ���� "+ numberOfStudents +"�� �Դϴ�.");
		System.out.println("A�� " + numberOfA + "�� �Դϴ�.");
		System.out.println("B�� " + numberOfB + "�� �Դϴ�.");
		System.out.println("C�� " + numberOfC + "�� �Դϴ�.");
		System.out.println("D�� " + numberOfD + "�� �Դϴ�.");
		System.out.println("F�� " + numberOfF + "�� �Դϴ�.");
		double average = (double) sumOfScores / (double) numberOfStudents;
		System.out.println("����� "+ average +"�Դϴ�.");
		System.out.println("");
		System.out.println("<<���� ó�� ���α׷��� �����մϴ�>>");
		
		myScanner.close();		
	}

}