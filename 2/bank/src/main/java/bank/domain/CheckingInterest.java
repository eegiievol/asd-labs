package bank.domain;

public class CheckingInterest implements addCalcInterest {
    @Override
    public double calcInterest(double balance) {
        if (balance<1000){
            return balance / 100 * 1.6;
        }
        else {
            return balance / 100 * 2.5;
        }
    }
}
