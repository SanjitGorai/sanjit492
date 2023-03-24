package javaprograming;

public class Rev {

	public static void main(String[] args) {
		
		String s="Sanjit";
		String s1=" ";
		
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		
		System.out.println(s1);
	}

}
