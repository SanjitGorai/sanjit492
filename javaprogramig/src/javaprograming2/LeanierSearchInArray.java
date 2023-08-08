package javaprograming2;

public class LeanierSearchInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int Search_ele=50 ;
		
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(Search_ele==a[i]) {
				System.out.println("Element Found "+a[i]);
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element Not Found");
		}
	}

}
