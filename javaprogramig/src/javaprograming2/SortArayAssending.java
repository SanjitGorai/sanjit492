package javaprograming2;

public class SortArayAssending {

	public static void main(String[] args) {
		int a[]= {50,10,20,30,60};
		int temp=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}				
			}
			System.out.print(a[i]+ " ");
		}
	}

}
