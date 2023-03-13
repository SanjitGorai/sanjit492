package javaprograming;

public class LinearSesrch {

	public static void main(String[] args) {
		
		int a[]= {10,20,40,50,30};
		int Search_ele= 50;
		boolean flag = false;
		for(int i=0;i<a.length;i++) 
		{
		 if(Search_ele==a[i])
		 {
			System.out.println("Element found at: "+i);
			flag=true;
			break;
		 }
		}
		if(flag==false) 
		{
			System.out.println("Element Not found");
	    }
		}

}
