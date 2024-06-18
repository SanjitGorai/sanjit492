package javaprograming;

public class OccuranceCount {
	public static void main(String[] args) {
		// int[] x= {1,2,1,4,8,9,1,3,9};
		String x =  "chandanann" ;
		int max=0;
		char ch=' ';
		char[] c=x.toCharArray();
		boolean[] occureance = new boolean[x.length()];
		for (int i = 0; i < x.length(); i++) {
			if (occureance[i]) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < x.length(); j++) {
				if (c[i] == c[j]) {
					occureance[j] = true;
					count++;
				}
			}
			if(max<count) {
				max=count;
				ch=c[i];
			}
			System.out.println(c[i] + "->" + count);
		}
		System.out.println(max+"->"+ch);
	}
}
