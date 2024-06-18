package javaprograming1;

import java.util.ArrayList;

public class ArrayListt {

	public static void main(String[] args) {
		
      ArrayList<String> cars=new ArrayList<String>();
      //Adding
      cars.add("BMW");
      cars.add("Honda");
      cars.add("Audi");
      cars.add("Audi");
      
      
      System.out.println(cars);
      //size
      int size=cars.size();
      System.out.println(size);
      
      //get
      System.out.println(cars.get(0));
      //iteration
      for(int i=0;i<size;i++) {
    	  System.out.println(cars.get(i));
      }
      
      //using for each loop
      for(String car:cars) {
    	  System.out.println(car);
    	  
      }
      
      
      
	}
     
	
}
