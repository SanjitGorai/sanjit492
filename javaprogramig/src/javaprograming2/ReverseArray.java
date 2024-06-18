package javaprograming2;

public class ReverseArray {

	public static void main(String[] args) {
	//	int a[]= {5,9,6,4,1};
		int num=123456;
		int rev=0;
		
		while(num>0) {
			
			rev=rev*10+num%10; 
			num=num/10;
			
		}
		System.out.println(rev);
		
	/*	StringBuffer sb=new StringBuffer(String.valueOf(b));
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		
		StringBuilder sbl=new StringBuilder();
		sbl.append(b);
		System.out.println(sbl.reverse()); */
		
		}
	}


