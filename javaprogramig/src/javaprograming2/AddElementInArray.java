package javaprograming2;

public class AddElementInArray {

	public static void main(String[] args) {
			
		int a[]= {10,20,30,50,60};
		int b[]= new int[a.length+1];
		int k=0;
		for(int i=0;i<b.length;i++) {
			if(i==3) {
				b[i]=40;				
				k++;
			}else {
				b[i]=a[i-k];
			}
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" , ");
		}
	}

}
