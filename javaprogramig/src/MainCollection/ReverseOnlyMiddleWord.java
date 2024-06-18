package MainCollection;

public class ReverseOnlyMiddleWord {

	public static void main(String[] args) {
		String str="my country best india";
		String ch[]=str.split(" ");
		int word = ch.length/2;
		ch[word ] = new StringBuilder(ch[word]).reverse().toString();
		
		String result = String.join(" ", ch);
		System.out.println(result);
	}

}
