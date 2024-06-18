package javaprograming2;

public abstract class ReverseWord1 {
	public static void main(String[] args) {
		String str="my name is sanjit";
		String ch[]=str.split(" ");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+ " ");
		}
	}
}
