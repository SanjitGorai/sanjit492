package javaprograming1;

public class FindVowelInString {

	public static void main(String[] args) {
		String str="education";
		int count=0;
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				count++;
				//System.out.println(ch[i]);
			}	else
				
				System.out.println(ch[i]);
		}
		System.out.println(count);
	}

}
