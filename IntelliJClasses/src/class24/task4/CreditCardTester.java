package class24.task4;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard(1500);
        creditCard.interestRate();
        System.out.println(creditCard.interest);
        AX ax=new AX(1500);
        ax.interestRate();
        System.out.println(creditCard.interest);
        Visa visa=new Visa(1500);
        visa.interestRate();
        System.out.println(creditCard.interest);

    }
}
