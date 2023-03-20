package javaprograming;

import java.util.Scanner;

public class PatternDiamond {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number ");
		int n=sc.nextInt();
		int star=1, space  = n/2;
		for(int i=1;i<=n;i++) {            //for line
			
			for(int j=1;j<=space;j++) {    //for space
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++ ) {
				System.out.print("*");
			}
		
			if(i<=n/2) {
				space--;
				star=star+2;
				
			}else {
				space++;
				star=star-2;
			}
			System.out.println();
		}
		
	}
	}


