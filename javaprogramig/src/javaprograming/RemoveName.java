package javaprograming;

public class RemoveName {

	public static void main(String[] args) {
		String s="sajeet";
		String s1="";
		for (int i = 0; i <s.length(); i++) {
			char c=s.charAt(i);
			if(c!='j'&& c!='a') {
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}

}
