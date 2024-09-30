package Assignment30;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary and number of hours work per day");
		int salary = sc.nextInt();
		int numberOfHours = sc.nextInt();
		Employee employee = new Employee();
		employee.getInfo(salary, numberOfHours);
		employee.addSalary();
		employee.addWork();
		employee.display();

	}

}
