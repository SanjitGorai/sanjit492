package javaprograming;

public class LeanearSearch {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int Search_ele=100;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			if(Search_ele==a[i]) {
				System.out.println("Element is found");
				flag=true;
				break;				
			}
		}
		if(flag==false) {
			System.out.println("Element Not Found");
		}
	}

}
