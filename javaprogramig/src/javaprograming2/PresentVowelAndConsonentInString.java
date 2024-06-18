package javaprograming2;

public class PresentVowelAndConsonentInString {

	public static void main(String[] args) {
		String str="My Name Is a sanjit";
		char s[]=str.toCharArray();
		int vowel=0,consonent=0;
		for (int i = 0; i < s.length; i++) {
			if (s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u') {
				vowel++;
			}else
				consonent++;
		}
		System.out.println("Vowel count :- "+vowel);
		System.out.println("consonent count :- "+consonent);
	}

}
