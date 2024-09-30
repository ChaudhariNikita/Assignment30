package Assignment30;

public class Employee {
	private int salary;
	private int numberOfHours;

	public void getInfo(int salary, int numberOfHours) {
		this.salary = salary;
		this.numberOfHours = numberOfHours;

	}

	public void addSalary() {
		if (salary < 500)
			salary = salary + 10;
	}

	public void addWork() {
		if (numberOfHours > 6)
			salary = salary + 5;
	}

	public void display() {
		System.out.println("Final salary of employee" + salary);
	}
}
