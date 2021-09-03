package class24.task4;

import com.sun.prism.impl.ps.CachingRoundRectRep;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate
    interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */

    double balance;
    double interest;

    CreditCard(double balance) {
        this.balance = balance;
    }

    public void interestRate() {
        if (balance < 500) {
            interest = balance * 0.24;
        } else {
            interest = balance * 0.01;
        }

    }
}

    class Visa extends CreditCard{
    Visa(double balance){
        super(balance);
    }


    }

    class AX extends CreditCard {

        AX(double balance){
            super(balance);
        }
        @Override
        public void interestRate(){
            if(balance<1000){
                interest=balance*0.15;
            }else{
                interest=balance*0.005;
            }
        }
    }



