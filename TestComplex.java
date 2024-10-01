package Assignment30;
import java.util.Scanner;
public class TestComplex {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter real and imag no");
		int real = sc.nextInt();
		int imag = sc.nextInt();
		System.out.println("Enter real and imag no");
		int real2 = sc.nextInt();
		int imag2 = sc.nextInt();

		Complex complex = new Complex(real, imag, real2, imag2);
		complex.sum();
		complex.diff();
		complex.product();
	}
	

}
