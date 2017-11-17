import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner=new Scanner(System.in);
		
		int givenN, count, sum;
		
		sum=0;
		count=1;
		
		System.out.println("1부터 N까지의 합을 구하려고 합니다. N값을 입력하십시오.");
		givenN = myScanner.nextInt();
		
		while (count <= givenN) {
			
			sum = sum + count;
			System.out.println("합계 : "+ sum);
			count = count+1;
		}
		
		System.out.println("완료되었으므로 프로그램을 종료합니다.");
		myScanner.close();
		
	}

}
