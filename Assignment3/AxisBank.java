package Assignment3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("deposit");
	}

		public static void main(String[] args) {	
			AxisBank myAxis=new AxisBank();
			myAxis.deposit();
			myAxis.saving();
			myAxis.fixed();
			myAxis.deposit();
		

	}

}
