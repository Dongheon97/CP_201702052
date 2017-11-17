
public class Program_6_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int degree = 1;
		
		while( degree < 180) {
			if ( degree < 10) {
				double radian = ((double) degree / 180.0)*3.141592;
				double sineValue = Math.sin(radian);
				int numberOfAsterisks = (int) ((sineValue * 40.0) + 0.5 ) ;
				
				System.out.print("sine(00" + degree + ")µµ : " );
				printAsterisks(numberOfAsterisks);
				System.out.println();
			}
			else if ( (degree>10) && (degree <100)) {
				double radian = ((double) degree / 180.0)*3.141592;
				double sineValue = Math.sin(radian);
				int numberOfAsterisks = (int) ((sineValue * 40.0) + 0.5 ) ;
			
				System.out.print("sine(0" + degree + ")µµ : " );
				printAsterisks(numberOfAsterisks);
				System.out.println();
			}
			
			else {
				double radian = ((double) degree / 180.0)*3.141592;
				double sineValue = Math.sin(radian);
				int numberOfAsterisks = (int) ((sineValue * 40.0) + 0.5 ) ;
				
				System.out.print("sine(" + degree + ")µµ : " );
				printAsterisks(numberOfAsterisks);
				System.out.println();
			}
			degree = degree + 5;
		}
	}
	private static void printAsterisks(int n) {
		int count = 0;
		while (count<=n) {
			System.out.print("*");
			
			count ++;
		}
	}

}
