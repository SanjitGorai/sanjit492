package javaprograming;

public class MinimumValueInArray {

	public static void main(String[] args) {
		
		int a[]= {50,30,64,20,10};
		int min=a[0];           
		
		for(int i=1;i<a.length;i++) 		
		{
			if(min>a[i]) 
							
			{
				min=a[i]; 
				
			}
		}
		System.out.println("Minimum element is array in "+min);  
		
	}
}
