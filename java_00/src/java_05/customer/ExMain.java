package java_05.customer;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer customerLee = new Customer();
		customerLee.setCustomerID("mem_lee");
		customerLee.setCustomerName("Lee");
		
		System.out.println(customerLee.customerInfo());
		System.out.println(customerLee.calcRatio(10000));
		
		
		VIPCustomer customerkim = new VIPCustomer();
		customerkim.setCustomerID("mem_kim");
		customerkim.setCustomerName("kim");
		
		Customer costomerPark = new VIPCustomer();
		costomerPark.setCustomerID("mem_park");
		costomerPark.setCustomerName("Park");
		
		
		System.out.println(customerkim.customerInfo());
		
		
	}

}
