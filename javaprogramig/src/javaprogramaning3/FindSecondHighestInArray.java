package javaprogramaning3;

public class FindSecondHighestInArray {

	public static void main(String[] args) {
		int ar[]= {40,30,10,50,20};
		int fbig=ar[0];
		int Sbig=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>fbig) {
				Sbig=fbig;
				fbig=ar[i];
			}else if(ar[i]>Sbig&&ar[i]!=fbig) {
				
			}
			
		}
		System.out.println(fbig);
		System.out.println(Sbig);
	}

}
