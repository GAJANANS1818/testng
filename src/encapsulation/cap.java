package encapsulation;

public class cap {
	private String name;
	public void setname(String name) {
		this.name = name;
		
		
	}
public String getname() {
	return name;
}
	public static void main(String[] args) {
		cap c = new cap();
		c.setname("tom");
System.out.println(c.getname());
c.setname("jerry");
System.out.println(c.getname());
	}

}
