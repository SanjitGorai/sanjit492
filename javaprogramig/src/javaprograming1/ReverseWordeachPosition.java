package javaprograming1;

public class ReverseWordeachPosition {

	public static void main(String[] args) {

		String str="how are you sanjit Prasad Gorai";
		
		String []s2=str.split(" ");
		
		for(String s:s2) {
			String s1="";
			 String c = s.substring(0, 1).toUpperCase();
			 System.out.println(c);
			 String d = s.substring(1);
			 s1=c+d+s1;
			 System.out.println(s1);
		}

	}

}
