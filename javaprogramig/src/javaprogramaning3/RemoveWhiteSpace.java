package javaprogramaning3;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str="My Sanjit   12";
		String str1[] =str.split(" ");
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
	}

}
