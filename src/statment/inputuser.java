package statment;
import java.util.Scanner;
public class inputuser {

	public static void main(String[] args) {
		System.out.println("enter the number: ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("value is:");
		System.out.println(a);
		System.out.println(" enter the 1st value:");
		int b= s.nextInt();
		System.out.println(" enter the 2nd value:");
		int c= s.nextInt();
		int d=b+c;
		System.out.println("the addition is=" +d);
		int f= b*c;
		System.out.println(" the mulptipication is=" +f);
		int g= b-c;
		System.out.println(" the subtraction is=" +g);
		int y= b/c;
		System.out.println(" the division is=" +y);

	}

}
