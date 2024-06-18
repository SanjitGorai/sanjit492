package javaprograming1;

public class SearchElementInArray {

	public static void main(String[] args) {
		int[]a= {10,20,20,30,40,50};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==20) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("found element "+count+" Times");
		}else {
			System.out.println("not found");
		}
	}

}
