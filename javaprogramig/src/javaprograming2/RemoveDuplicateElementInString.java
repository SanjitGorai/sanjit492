package javaprograming2;

public class RemoveDuplicateElementInString {

	public static void main(String[] args) {
		String str="sasajitt";
		char ch[]= str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[i]='0';
					ch[j]='0';
				}
			}
			if(ch[i]!='0') {
				System.out.print(ch[i]+" ");
			}
		}
	}

}
