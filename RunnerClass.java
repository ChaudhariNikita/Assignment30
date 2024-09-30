package Assignment30;

public class RunnerClass {

	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car();
		Car car2 = new Car();
		car.set("Model x", "Tesla", 90000, "ABC");
		car1.set("i10", "Honda", 10000, "xyz");
		car2.set("Aura", "Hundai", 15000, "PQR");
		car.display();
		System.out.println("----------");
		car1.display();
		System.out.println("-----------");
		car2.display();
	}

}
