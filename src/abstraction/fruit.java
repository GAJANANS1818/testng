package abstraction;

abstract class fruit {
	static public void a1() {
		System.out.println("i am m1");
	}
	abstract void taste();
}
class apple extends fruit{
	void taste() {
	System.out.println("tatse is sweet");
	}




	public static void main(String[] args) {
	
		
		fruit apple = new apple();
		apple.taste();
		apple.a1();
		
		fruit.a1();
		
		
		

	}

}
