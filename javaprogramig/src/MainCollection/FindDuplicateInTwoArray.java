package MainCollection;

public class FindDuplicateInTwoArray {

	public static void main(String[] args) {
		int[] a = {0, 1, 2, 3, 4, 5};
        int[] a1 = {4, 7, 8, 9, 10, 1};
        duplicate(a, a1);
	}
	
	public static void duplicate(int[] a,int[] a1) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a1.length;j++) {
				if(a[i]==a1[j]) {
					System.out.println(a[i]+" ");
					
				}
			}
		}
	}

}
