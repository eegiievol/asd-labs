package without.templatemethod;

public class VisaPayment extends PaymentTemplate{

    private VisaCard visaCard;

    public void setVisaCard(VisaCard visaCard){
        this.visaCard = visaCard;
    }
    @Override
    public boolean validate(Customer customer) {
        // logic to validate visa card

        System.out.println("Validate visa card with card number " + visaCard.getCreditCardNumber());
        return true;
    }

    @Override
    public void perform(Customer customer, double amount) {
        // logic to perform payment visa card
        System.out.println("Perform payment with visa card with card number " + visaCard.getCreditCardNumber()
                + " and amount $" + amount);

        // logic to notify customer
        System.out.println("Notify customer " + customer.getName() + " with email " + customer.getEmail()
                + " about visa credit card payment with card number " + visaCard.getCreditCardNumber());
    }
}
