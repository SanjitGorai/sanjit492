package javaprograming2;

public class CheckStringvari {

	public static void main(String[] args) {
		String s=new String("abc");
		String s1=s;
		String s3=s;
		
		System.out.println(s==s1);
		System.out.println(s1==s3);

	}

}
