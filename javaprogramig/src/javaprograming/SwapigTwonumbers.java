package javaprograming;

public class SwapigTwonumbers {

	public static void main(String[] args) {
		int a=10 ,b=20;
		System.out.println("before Swaping value are.."+a+" "+b);
		
		//logic 1 
		int t=a;
		a=b;
		b=t;
		
		//logic 2
		a=a+b;
		b=a-b;
		a=a-b;
		
		//logic 3
		b=a+b-(a=b);
		
		System.out.println("After Swaping value are.."+a+" "+b);
	}

}
