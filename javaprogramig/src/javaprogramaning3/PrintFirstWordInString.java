package javaprogramaning3;

public class PrintFirstWordInString {

	public static void main(String[] args) {
		String str="Boy is good";
		String ch[]=str.split(" ");
		String s="";
		for(int i=0;i<ch.length;i++) {
			s=s+ch[i].charAt(0);
		}
		System.out.println(s);
	}

}
