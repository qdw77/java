package java_05.customer;

public class Customer {

	//customerID - 고객 아이디
	//customerName - 고객 이름
	//customerGrade - 고객 등급
	//bonusPoint - 고객 보너스 포인트(제품 구매 시 누적)
	//bonusRatio - 
	
	protected String customerID;
	protected String customerName;
	protected String customerGrade;
	protected int customerPoint;
	protected double customerRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		customerRatio = 0.01;
	}
	
	public int calcRatio(int price) {
		customerPoint += price * customerRatio;
		//customerPoint = customerPoint +(price * customerRatio);
		return customerPoint;
	}
	
	public String customerInfo() {
		String result = "";
		
		result += "[ 고객 아이디 ]"+customerID +"\n";
		result += "[ 고객 이름 ]"+customerName +"\n";
		result += "[ 고객 등급 ]"+customerGrade +"\n";
		result += "[ 고객 보너스 포인트 ]"+customerPoint +"\n";
		result += "[ 적립 비율 ]"+customerRatio +"\n";
		
		return result;
	}
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return customerPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.customerPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return customerRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.customerRatio = bonusRatio;
	}
	
	
	
	
	
}
