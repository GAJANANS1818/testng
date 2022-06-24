package swapfib;

public class fibonacci {

	public static void main(String[] args) {
		int x=0;
		int y=1;
		int z;
		for (int r=1; r<=22; r++) {
			z=x+y;
			x=y;
			y=z;
			System.out.println("" +z);
		}

	}

}
