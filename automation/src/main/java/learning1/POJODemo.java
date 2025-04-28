package learning1;

public class POJODemo {
	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.setBankName("HDFC");
		b1.setInterestRate(5.0f);
		b1.setInterestRate(4.0f);
		System.out.println(b1.getBankName());
		System.out.println(b1.getInterestRate());
		
		//  Rule - interest rate can't be decrease ?
	
		// Encapsulation	
	}
}

class Bank{
	private String bankName;
	private String ifsc;
	private float interestRate;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		if(interestRate > this.interestRate) {
		this.interestRate = interestRate;
		}
	}	
}