package gs;

public class operator3 {
	public void loyal() {
		int x=50;
		int y=45;
		System.out.println((x>y)&& (x<y));
		System.out.println((x>y)||(x<y));
		System.out.println((x==y)&&(x!=y));
		System.out.println((x==y)||(x!=y));
	}

	public static void main(String[] args) {
		operator3 d= new operator3();
		d.loyal();

	}

}
