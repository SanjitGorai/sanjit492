package javaprograming;

import java.util.ArrayList;

public class testPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {10,20,30,40,50,60,70,80};;
		boolean pair=false;

		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==90) {
					pair=true;

					System.out.println(a[i]+" and "+a[j]+" is in pair " );
				}
			}
		}



	}

}
