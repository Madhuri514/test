package learning1;

public class OverridingDemo {
public static void main(String[] args) {
	//  i need to print interet rate of bank
	
	Bank1 bank =  new HDFC();
	
	int principalAmount = 1000;
	int year = 1;
	
	int interest = (principalAmount * year * bank.interestRate())/100;
	int total = principalAmount  +interest;
	System.out.println(total);
}
}

abstract class Bank1{
	public abstract int interestRate();
}

class HDFC extends Bank1{
	public int interestRate() {
		return 5;
	}
}


class ICICI extends Bank1{
	public int interestRate() {
		return 3;
	}
}
// Runtime Polymorphism



