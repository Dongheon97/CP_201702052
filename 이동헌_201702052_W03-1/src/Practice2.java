import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myScanner=new Scanner(System.in);
		
		int givenN, count, sum;
		
		sum=0;
		count=1;
		
		System.out.println("1���� N������ ���� ���Ϸ��� �մϴ�. N���� �Է��Ͻʽÿ�.");
		givenN = myScanner.nextInt();
		
		while (count <= givenN) {
			
			sum = sum + count;
			System.out.println("�հ� : "+ sum);
			count = count+1;
		}
		
		System.out.println("�Ϸ�Ǿ����Ƿ� ���α׷��� �����մϴ�.");
		myScanner.close();
		
	}

}
