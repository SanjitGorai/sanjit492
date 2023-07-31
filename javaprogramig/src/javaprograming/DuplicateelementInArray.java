package javaprograming;

public class DuplicateelementInArray {

	public static void main(String[] args) {
		int arr[]= {2,2,2,2,2,3,3,6,3,3,6,6,8,8,8,9,3,5,5,5};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=0;
				}
			}
		}
    for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=0) {
			System.out.print(arr[i]+",");
		}
	}
	}

}
