package bank.domain;

public class SavingInterest implements addCalcInterest {
    @Override
    public double calcInterest(double balance) {
        if (balance < 1000){
            return balance / 100 * 1;
        }
        else if (balance > 1000 && balance < 5000) {
            return balance / 100 * 2;
        }
        else {
            return balance / 100 * 4;
        }
    }
}
