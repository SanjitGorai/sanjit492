package javaprograming1;

public class ReverceArray {

	public static void main(String[] args) {
	//	int a[]= {10,20,30,40,50};
		String str="my name is sanjit";
		char ch[]=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+ "");		
		}
	}

}
