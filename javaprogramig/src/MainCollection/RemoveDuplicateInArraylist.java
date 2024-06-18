package MainCollection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateInArraylist {

	public static void main(String[] args) {
		ArrayList<String>ar=new ArrayList<>();
		ar.add("Dhoni");
		ar.add("Virat");
		ar.add("Rahul");
		ar.add("Dhoni");
		ar.add("Sanjit");
		ar.add("Sanjit");
		
		ArrayList<String>ar1=new ArrayList<>();
		//ar1.addAll(ar);
		for(int i=0;i<ar.size();i++) {
		if(!ar1.contains(ar.get(i))) {
			ar1.add(ar.get(i));
		}
		}
		System.out.println(ar1);
		LinkedHashSet<String>lh=new LinkedHashSet<>();
		lh.addAll(ar);
		ar.clear();
		ar.addAll(lh);
		System.out.println(ar);
		
	}

}
