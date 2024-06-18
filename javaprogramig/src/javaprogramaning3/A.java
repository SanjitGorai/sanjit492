package javaprogramaning3;

public class A {
			
	public static String printWithoutVowel(String a) {
		StringBuilder sbl=new StringBuilder();
		char ch[]=a.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!(ch[i]=='a'||ch[i]=='e'||ch[i]=='o'||ch[i]=='i'||ch[i]=='u')) {
				sbl.append(ch[i]);
				
			}
		}
		return sbl.toString();
		
		
	}
	
	public static void main(String[] args) {
			
			System.out.println(A.printWithoutVowel("sanjit"));
			
	}

	
}
