package javaprograming2;

public class AsseningArray {

	public static void main(String[] args) {
		int ar[]= {40,-20,-10,50,10};
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if (ar[i]>ar[j]) {
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			System.out.println(ar[i]);
		}
		
	}

}
