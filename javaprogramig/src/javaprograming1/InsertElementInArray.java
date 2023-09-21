package javaprograming1;

public class InsertElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,50,60};
		int b[]= new int[a.length+3];
		int k=0;
		int v=0;
		int v1=0;
		
		for (int i = 0; i < b.length; i++) {
			if(i>=3&&i<6) {
				b[i]=100+v;
				v=100+v1;
				v1=100;
				k++;
			}
			else {
				b[i]=a[i-k];
			}
			
		}for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" , ");
		}		
	}

}
