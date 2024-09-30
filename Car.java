package Assignment30;

public class Car {
	private String carModel; 
	private String carName;
	private double carPrice;
	private String carOwner;
	public void set(String carModel, String carName, double carPrice, String carOwner) {
		
		this.carModel = carModel;
		this.carName = carName;
		this.carPrice = carPrice;
		this.carOwner = carOwner;
	}
	public void display()
	{
		System.out.println("Car model is "+carModel);
		System.out.println("Car name is "+carName);
		System.out.println("Car price is "+carPrice);
		System.out.println("Car owner is "+carOwner);
	}

}
