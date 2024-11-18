public class CreditPaymentService {
    public int calculate(int loanAmount, int loanTerm, double interestRate) {
        int annuityPayment = (int) Math.round(loanAmount * (interestRate / (12 * 100)) / (1 - Math.pow((1 + (interestRate / (12 * 100))), -loanTerm)));
        return annuityPayment;
    }
}
