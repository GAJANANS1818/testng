package statment;
import java.util.Scanner;
public class voweluser {

	public static void main(String[] args) {
		System.out.println("enter the charater: ");
	Scanner s = new Scanner(System.in);
		char p = s.next().charAt(0);
		switch(p) {
		case 'a': System.out.println("it is vowel");
		break;
		case 'e': System.out.println(" it is vowel");
		break;
		case 'i': System.out.println(" it is vowel");
		break;
		default: System.out.println(" it is consonent");
		}

	}

}
