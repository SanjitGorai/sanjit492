package javaprograming2;

public class PalindromString {

	public static void main(String[] args) {
		String str="madama";
		String org_str=str;
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		if(org_str.equals(rev)) {
			System.out.println("String is Palindrom  " +str);
		}else {
			System.out.println("String in Not Palindrom "+str);
		}
	}

}
