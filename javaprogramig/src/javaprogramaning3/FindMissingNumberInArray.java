package javaprogramaning3;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,8,10};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of element in array --> "+sum);
		int sum1=0;
		for(int i=1;i<=10;i++) {
			sum1=sum1+i;
		}
		System.out.println(sum1);
		System.out.println("missing number ---> "+(sum1-sum));
	}

}
