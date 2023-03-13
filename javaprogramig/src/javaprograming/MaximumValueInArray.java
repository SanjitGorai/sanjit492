package javaprograming;

public class MaximumValueInArray {

	public static void main(String[] args) {
		
		int a[]= {20,10,50,75,100};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max) 
			{
				max=a[i];
				
			}
		}
		System.out.println("maximum element is array in: "+max);
	}

}
