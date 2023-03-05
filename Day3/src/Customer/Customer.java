package Customer;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerCity;
	Customer(){
		
	}

	void display() {
		System.out.println(customerId+" "+customerName+" "+customerCity);
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	
}
