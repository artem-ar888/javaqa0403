public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000; // сумма кредита в руб.
        int loanTerm = 12; // срок кредита в мес.
        double interestRate = 9.99; // процентная ставка в %
        System.out.printf("\n Сумма кредита: %,d руб. \n Срок кредита: %s мес.  \n Процентная ставка: %s %% \n", loanAmount, loanTerm, interestRate);
        System.out.printf("Ежемесячный платёж: %,d руб.\n", service.calculate(loanAmount, loanTerm, interestRate));

        loanAmount = 1_000_000; // сумма кредита в руб.
        loanTerm = 24; // срок кредита в мес.
        interestRate = 9.99; // процентная ставка в %
        System.out.printf("\n Сумма кредита: %,d руб. \n Срок кредита: %s мес.  \n Процентная ставка: %s %% \n", loanAmount, loanTerm, interestRate);
        System.out.printf("Ежемесячный платёж: %,d руб.\n", service.calculate(loanAmount, loanTerm, interestRate));

        loanAmount = 1_000_000; // сумма кредита в руб.
        loanTerm = 36; // срок кредита в мес.
        interestRate = 9.99; // процентная ставка в %
        System.out.printf("\n Сумма кредита: %,d руб. \n Срок кредита: %s мес.  \n Процентная ставка: %s %% \n", loanAmount, loanTerm, interestRate);
        System.out.printf("Ежемесячный платёж: %,d руб.\n", service.calculate(loanAmount, loanTerm, interestRate));
    }
}