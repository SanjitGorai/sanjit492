package javaprogramaning3;

public class OverloadingDemo {
	public void test(Integer i) {
		System.out.println("Integer");
	}
	
	public void test(int i) {
		System.out.println("int");
	}
	public void test(long i) {
		System.out.println("long");
	}
	
	public static void main(String[] args) {
		OverloadingDemo obj=new OverloadingDemo();
		obj.test(1000000000);
	}
}
