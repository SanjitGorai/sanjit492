package javaprograming;

public class FindSecondChar {

	public static void main(String[] args) {
		String str= "PRASADP";
		char []ch=str.toCharArray();
		boolean flag=false;
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Found Duplicate Element "+ch[i]);
					flag=true;
					break;
				}
			}
		}
		if(flag==false) {
			System.out.println(" not Found Duplicate Element");
		}
			
			
			
		}

	}


