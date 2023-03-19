package without.templatemethod;

public class PayPalPayment extends PaymentTemplate{
    @Override
    public boolean validate(Customer customer ) {
        // logic to validate paypal address
        System.out.println("Validate paypal address ");
        return true;
    }

    @Override
    public void perform(Customer customer, double amount) {
        // logic to perform paypal payment
        System.out.println("Perform payment with paypal address "+customer.getEmail()+" and amount $"+amount);

        // logic to notify customer
        System.out.println("Notify customer "+customer.getName()+" with email "+customer.getEmail()+" about paypal payment to address "+customer.getEmail());
    }
}
