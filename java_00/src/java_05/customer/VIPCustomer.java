package java_05.customer;

public class VIPCustomer extends Customer {
	
	//Vip 고객 전용 혜택 관리
	
	//agentId  - 전문 상담사
	//saleRatio - 제품 구매 할인율 10%
	//bonusRatio - 0.05 (5%) - 
	
	private String agentId;
	private double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		customerRatio = 0.05;
		saleRatio = 0.1;
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

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	

}
