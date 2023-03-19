package without.templatemethod;

public abstract class PaymentTemplate {


    public final void process(Customer customer, double amount, String currency){

        double dollarAmount = amount;

        if (currency.contentEquals("EUR")) { // European Euro
            dollarAmount = amount * 1.1;
            System.out.println("Convert "+amount+" "+currency+" to US dollars");

        }
        if (currency.contentEquals("INR")) { // Indian Rupee
            dollarAmount = amount * 0.014;
            System.out.println("Convert "+amount+" "+currency+" to US dollars");

        }

        if (this.validate(customer)) {
            this.perform(customer, dollarAmount);
        }
    }
    public abstract boolean validate(Customer customer);

    public abstract void perform(Customer customer, double amount);
}
