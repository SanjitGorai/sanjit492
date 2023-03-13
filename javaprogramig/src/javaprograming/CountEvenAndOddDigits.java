package javaprograming;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		
		int num=12345;
		int even_count=0;
		int Odd_count=0;
		
 		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				even_count++;
			}
			else 
			{
				Odd_count++;
			}
			num=num/10;
		}
         System.out.println("Number of even count "+even_count);
         System.out.println("Number of odd count "+Odd_count);
	}

}
