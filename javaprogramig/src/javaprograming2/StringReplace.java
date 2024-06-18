package javaprograming2;

public class StringReplace {

	public static void main(String[] args) {
			String str="THIS is FIS Global ";
		    
			str=str.replaceAll("\\s", "");
			System.out.println(str);
			String rev="";
			char ch[]=str.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				rev=str.charAt(i)+rev;
			}
			System.out.println(rev);
			if(str.equals(rev)) {
				System.out.println("it is palindrom");
			}else {
				System.out.println("it is not palindrom");
			}
	}

}
