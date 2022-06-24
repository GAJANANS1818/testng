package gs;

public class args1 {
static void morn(int p,int r) {
	int q;
	q=p*r;
	System.out.println(q);
}
public class args2{
	static void morn(int a,int b) {
		int c;
		c=a-b; System.out.println(c);
	}
}
	public static void main(String[] args) {
		
args1.morn(5, 8);
args2.morn(20,50);
	}

}
