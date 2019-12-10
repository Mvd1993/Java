
public class Credit {
	double totalCredit;
	double comission;
	double toPay;
	BankClient owner;
	
	

	public Credit(double totalCredit, double comission, BankClient owner) {
		super();
		this.totalCredit = totalCredit;
		this.comission = comission;
		this.owner = owner;
		this.toPay = totalCredit/(comission/100);
	}



	@Override
	public String toString() {
		return "Credit [totalCredit=" + totalCredit + ", comission=" + comission + ", toPay=" + toPay + ", owner="
				+ owner + "]";
	}



	public double getTotalCredit() {
		return totalCredit;
	}



	public void setTotalCredit(double totalCredit) {
		this.totalCredit = totalCredit;
	}



	public double getComission() {
		return comission;
	}



	public void setComission(double comission) {
		this.comission = comission;
	}



	public double getToPay() {
		return toPay;
	}



	public void setToPay(double toPay) {
		this.toPay = toPay;
	}



	public BankClient getOwner() {
		return owner;
	}



	public void setOwner(BankClient owner) {
		this.owner = owner;
	}
	
}
