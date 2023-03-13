package javaprograming;

import java.util.Scanner;

public class SizeOfImage {
	
	public static String StringChallenge(String str) {
		double rating =Double.parseDouble(str);
		int numStars = (int)rating;
		StringBuilder result = new  StringBuilder();
		for(int i=0;i<numStars;i++) {
			result.append("full");
		}
		if(rating-numStars>=5) {
			result.append("half ");
		}
		for(int i=0;i<5-numStars-(rating-numStars>=0.5?1:0);i++) {
			result.append("empty ");
		}
		return result.toString().trim();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//String strr = sc.nextLine();
		System.out.println(StringChallenge(sc.nextLine()));
		

	}

}
