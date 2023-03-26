package javaprograming;

public class Print1To10UsingRecursion {

	public static void main(String[] args) {
		{
			Print(1);
		}
	}
		public static void Print(int i) {
			if(i==10) {
				System.out.println(i);
				return;
			}
			System.out.println(i);
			i++;
			Print(i);
		}

		}

	


