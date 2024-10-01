package Assignment30;

import java.util.Scanner;

public class TestMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and cols for matrix 1");
		int row = sc.nextInt();
		int cols = sc.nextInt();
		System.out.println("Enter the rows and cols for matrix 2");

		int row1 = sc.nextInt();
		int cols1 = sc.nextInt();
		Matrix matrix = new Matrix(row, cols, row1, cols1);
		matrix.getrow();
		matrix.getcols();
		System.out.println("===========================");
		matrix.setEle();
		System.out.println("===========================");
		matrix.AddArr();

	}

}
