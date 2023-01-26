
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("###Test Customer class###");
		Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		System.out.println(c1);// Customer's toString()
		c1.setDiscount(5);// set customer's discount is 5
		System.out.println(c1);// Customer's toString()
		Line();
		System.out.println("Id is "+c1.getId());// show customer's id
		System.out.println("name is"+c1.getName());// show customer's name
		System.out.println("discount is "+c1.getDiscount());// show customer's discount
		Line();
		System.out.println("###Test Invoice class###");
		Invoice inv1 = new Invoice(101, c1, 12000.00);
		System.out.println(inv1);// Invoice's toString()
		inv1.setAmount(10000);// set invoice's amount is 10000
		System.out.println(inv1);// Invoice's toString()
		Line();
		System.out.println("Id is "+inv1.getId());// show invoice's id
		System.out.println("Customer is  "+inv1.getCustomerName());// Customer's toString() by instance inv1
		System.out.println("Amount is "+inv1.getAmount());// show invoice's amount
		Line();
		System.out.println("Customer's Id is "+inv1.getCustomerId());// show customer's id by instance inv1
		System.out.println("Customer's name is "+inv1.getCustomerName());// show customer's name by instance inv1
		System.out.println("Customer's discount is "+inv1.getCustomerDiscount());// show customer's discount by instance inv1
		System.out.println("ammount After discount is  "+inv1.getAmountAfterDiscount());// show invoice's amount after discount(format as output)
		} //end of main method()
		public static void Line() {
		for(int i =1 ;i<51;i++) {
			System.out.print("*");
			
		}
		System.out.println();
		 //end of class()
	}
		}


