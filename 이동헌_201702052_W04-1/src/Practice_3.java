
public class Practice_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givenN, count=2, fact=1;
		
		givenN = 5;
		
		while(count <= givenN) {
		
			fact = fact*count;
				
			count = count + 1;
		}
		System.out.println("계산한 값은 " + fact + "입니다.");
	}
}
