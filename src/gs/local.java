package gs;

public class local {

	public void method() {
		
		int a=30;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	public void method2() {
		int k=70;
		int l=20;
		int m=k/l;
		System.out.println(m);
		
		
	}
	public void method3() {
		int g=50;
		int h=30;
		int i=g*h;
		System.out.println(i);
	}
	
	
	public static void main(String[] args) {
		local d= new local();
		d.method();
		d.method2();
		d.method3();

	}

}
