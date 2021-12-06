package Object;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address=new Address("lne1","hyderabad");
		Customer cs=new Customer();
		cs.setAddress(address);
		cs.setName("ram");
	
		System.out.println(cs);
		
		
		

	}

}
