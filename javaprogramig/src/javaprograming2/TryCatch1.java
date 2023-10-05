package javaprograming2;

public class TryCatch1 {

	public static void main(String[] args) {
		 int a=10;
		 int b=0;
		 try {
			 System.out.println(a/b);
		 }
		 catch(ArithmeticException e) {
			 System.out.println("ArithmeticException  handled");
		 }
		 catch (Exception e) {
			System.out.println("Exception Handled");
		}
		 
	}

}
