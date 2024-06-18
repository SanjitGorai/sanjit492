package javaprogramaning3;

public class Pattern1to9 {

	public static void main(String[] args) {
		int z=1;

		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
								
				System.out.print(" "+z);
				//z++;				
			}
			System.out.println();
			z++;
			if(z>=9)
			{
				z--;                
			}
		}
	}

}
