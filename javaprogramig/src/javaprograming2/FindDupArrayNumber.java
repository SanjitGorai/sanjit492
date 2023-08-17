package javaprograming2;

public class FindDupArrayNumber {

	public static void main(String[] args) {
		int a[]= {1,3,4,8,1,4,8,9,3};
		int count=0;
		for(int i=0;i<a.length;i++) {
			count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(a[i]);
			}
		}
	}

}
