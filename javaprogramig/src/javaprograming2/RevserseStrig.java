package javaprograming2;

public class RevserseStrig {

	public static void main(String[] args) {
		
		String str="nishant";
		String rev="";
		for (int i = 0; i < str.length(); i++) {
			rev=str.charAt(i)+rev;
			
			
		}
		System.out.println(rev);
		
	}

}
