package Customer;

public class Demo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustomerId(1);
		c1.setCustomerName("praveenkumar S");
		c1.setCustomerCity("Chennai");
		Customer c2 = new Customer();
		c2.setCustomerId(2);
		c2.setCustomerName("Sanjay");
		c2.setCustomerCity("pondicherry");
		System.out.println(c1.getCustomerId());
		System.out.println(c1.getCustomerName());
		System.out.println(c1.getCustomerCity());
		System.out.println(c2.getCustomerId());
		System.out.println(c2.getCustomerName());
		System.out.println(c2.getCustomerCity());
	}

}
