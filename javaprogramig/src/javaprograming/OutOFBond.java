package javaprograming;

public class OutOFBond {

	public static void main(String[] args) {
		int []a= {1,3,1,1,2,5,3};
		boolean flag = false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("same element"+" "+a[i]);				
					flag=true;
				}
				
			}
			
		}
		if(flag==false) {
			System.out.println("not found");
		}
		 
		
		
	}

}
