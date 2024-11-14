public class CreditPaymentService {
    public int calculate (int s, int t, double p) {
        int annuityPayment = (int) Math.round(s * (p / (12 * 100)) / (1 - Math.pow((1 + (p / (12 * 100) )), -t)));
        return annuityPayment;
    }
}
