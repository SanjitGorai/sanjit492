package javaprograming;

public class FactorialNumbber {

	public static void main(String[] args) {
		
		int num=5;
		long factorial=1;
		
	/*	for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		} */
		
		for(int i=num;i>=1;i--) 
		{
			factorial=factorial*i;
		}
		System.out.println(num+ " factorial is  "+factorial);

	}

}
