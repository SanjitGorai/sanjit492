package javaprograming;

import java.util.Random;
import java.util.stream.DoubleStream;

import org.apache.commons.lang3.RandomStringUtils;

public class GeerateRadomNumerAndString {

	public static void main(String[] args) {
	
		Random rand =new Random();
	//	int rand_num=rand.nextInt(100);
	//	System.out.println(rand_num);
		
		
	//	double rand_dbl= rand.nextDouble();
	//	System.out.println(rand_dbl);
		
		//Approch 2
		
		//	System.out.println(Math.random());
		
		//Approch 3
			
	String randNum=	RandomStringUtils.randomNumeric(5);
	System.out.println(randNum); 
		
		
	}

}
