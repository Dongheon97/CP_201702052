
public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		double x1, x2;
		double determinant;
		
		a = 6.2;
		b = 1.8;
		c = 9.3;
		
		determinant = (b*b)-(4*a*c);
		x1 = (-b + Math.sqrt(determinant)) / (2*a);
		x2 = (-b - Math.sqrt(determinant)) / (2*a);
		
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);
		System.out.println("The solution is " + x1 + " or " + x2 +".");
	}

}
