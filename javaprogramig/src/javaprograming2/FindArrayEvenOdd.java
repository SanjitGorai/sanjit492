package javaprograming2;

public class FindArrayEvenOdd {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int even=0,odd=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				even++;
			}else
				odd++;
		}
		System.out.println("Even Count "+even);
		System.out.println("Odd Count "+odd);
	}

}
