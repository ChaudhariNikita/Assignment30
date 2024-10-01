package Assignment30;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccounts savingsAccounts = new SavingsAccounts();
		SavingsAccounts savingsAccounts1 = new SavingsAccounts();
		savingsAccounts.setSavingBalance(10000.00);
		savingsAccounts1.setSavingBalance(50000.00);

		savingsAccounts.modifyInterestRate(3);

		System.out.println("intereset when is 3");
		savingsAccounts.calculateMonthlyInterest();
		System.out.println("\nintereset when is 3");
		savingsAccounts1.calculateMonthlyInterest();
		System.out.println("=====================================================");
		savingsAccounts.modifyInterestRate(4);
		System.out.println(" After modifying ");
		savingsAccounts.calculateMonthlyInterest();
		savingsAccounts1.calculateMonthlyInterest();
	}

}
