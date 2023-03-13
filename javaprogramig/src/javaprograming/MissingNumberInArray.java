package javaprograming;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,6,7,8,9};
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of Array "+sum1);
		
		int sum2=0;
		for(int i=1;i<=9;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of range of element in Array "+sum2);
		System.out.println("missing Number is in Array "+(sum2-sum1));
	}

}
