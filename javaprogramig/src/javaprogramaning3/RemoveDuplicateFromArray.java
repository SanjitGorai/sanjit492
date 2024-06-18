package javaprogramaning3;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		int a[]= {1,2,2,3,3,4,5};
		
		for(int i=0;i<a.length;i++) {
			boolean isDuplicate = false;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
