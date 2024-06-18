package javaprograming2;

public class PalindromNumber {

	public static void main(String[] args) {
		int num=121;
		int org_num=num;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(rev==org_num) {
			System.out.println("it is a palindrom");
		}else
			System.out.println("It is not palindrom");
	}

}
