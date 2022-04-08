package week3.Day1.Bank;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		
		System.out.println("Deposit to the account");
		
	}

	public static void main(String[] args) {
		
		AxisBank Axis = new AxisBank();
		Axis.saving();
		Axis.fixed();
		Axis.deposit();

	}

}
