package polymorphism;

public class overloading {
public String apple(String a) {
	System.out.println("apple is red");
	return a;
	
	
	
	
}
public void apple(int b) {
	System.out.println("apple is sweet");
	
}
	public static void main(String[] args) {
		overloading o = new overloading();
		o.apple(10);

	}

}
