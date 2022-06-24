package polymorphism;

 class aa{
	 public void tv() {
		 System.out.println("it is best for entertainment");
	 }
 }
  class overriding extends aa {
	 public void tv() {
		 System.out.println("it is bad for eyes");
	 }
	 
	 	

	public static void main(String[] args) {
		overriding o1 = new overriding();
		o1.tv();

	}

}
