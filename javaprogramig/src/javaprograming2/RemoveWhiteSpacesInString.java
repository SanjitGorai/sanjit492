package javaprograming2;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		String str="My Name Is Sanjit";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
				
	}

}
