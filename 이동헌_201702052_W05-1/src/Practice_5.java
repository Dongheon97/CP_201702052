
public class Practice_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		double n=1;
		
		System.out.println("<<Sine �� ����� �����մϴ�>>");
		System.out.println("");
		
		while(n <= 180) {
			double x = (double)n * (3.141592 / 180.0);
			double y = Math.sin(x);
			
			System.out.println("Sine(" + n + "��) �� " + y + " �Դϴ�.");
			n++;
		}
		
		
	}

}
