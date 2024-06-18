package javaprograming2;

public class RevserseStrig {

	public static void main(String[] args) {
		
		String str="my name is sanjit gorai";
		String str1 = str.replaceAll("\\s", "");
		String []rev=str1.split("");
		
		for (int i=rev.length-1;i>=0;i--) {
			System.out.print(rev[i]+"");	
			
		}
		
		
	}

}
