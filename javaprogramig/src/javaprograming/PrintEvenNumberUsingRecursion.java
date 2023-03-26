package javaprograming;

public class PrintEvenNumberUsingRecursion {

	public static void main(String[] args) {
		PrintEven(1);
	}
		
		public static void PrintEven(int i) {
			if(i%2==0) {
				System.out.println(i);
				if(i==10) {
					return;
				}
			}
			i++;
			PrintEven(i);
		}
		
	}


