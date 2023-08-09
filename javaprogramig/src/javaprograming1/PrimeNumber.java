package javaprograming1;

public class PrimeNumber {

	public static void main(String[] args) {

		int sum= 0;
		for(int i=1;i<=100;i++) {

			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+i;
					
				}
			}
			if(sum==i) {
				System.out.println(i+" :- Hello");

			}
			if(i%2==0) {
				System.out.println(i+" :- Hello world ");
			}else {

				System.out.println(i+":-  World  ");
			}
		}
	}
}