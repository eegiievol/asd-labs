package without.templatemethod;

public class Application {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Frank Brown", "fbrown@gmail.com");
		VisaCard visaCard = new VisaCard("1111 2222 3333 4444", "Frank Brown", "09/2026",112);

		VisaPayment visaPayment = new VisaPayment();
		visaPayment.setVisaCard(visaCard);
		visaPayment.process(customer1, 125.75, "USD");
		
		System.out.println("------------------------------------");
		
		Customer customer2 = new Customer("John Doe", "jdoe@gmail.com");
		PayPalPayment payPalPayment = new PayPalPayment();
		payPalPayment.process(customer2, 175000, "INR");

	}
}
