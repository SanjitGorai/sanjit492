package javaprograming2;

public class ReverseWord {

	public static void main(String[] args) {
		String str="My name is Sanjit";
		String ch[]=str.split(" ");
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
		}
	}

}
