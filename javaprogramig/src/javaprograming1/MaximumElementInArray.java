package javaprograming1;

public class MaximumElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,50,30,40};
		int max;
		max=a[0];
		for(int i=1;i<a.length-1;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum Element In Array :- "+max);
	}

}
