public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int a = 1_000_000; // сумма кредита в руб.
        int b = 12; // срок кредита в мес.
        double c = 9.99; // процентная ставка в %
        System.out.printf("\n Сумма кредита: %,d руб. \n Срок кредита: %s мес.  \n Процентная ставка: %s %% \n", a, b, c);
        System.out.printf("Ежемесячный платёж: %,d руб.\n", service.calculate(a, b, c));

        a = 1_000_000; // сумма кредита в руб.
        b = 24; // срок кредита в мес.
        c = 9.99; // процентная ставка в %
        System.out.printf("\n Сумма кредита: %,d руб. \n Срок кредита: %s мес.  \n Процентная ставка: %s %% \n", a, b, c);
        System.out.printf("Ежемесячный платёж: %,d руб.\n", service.calculate(a, b, c));

        a = 1_000_000; // сумма кредита в руб.
        b = 36; // срок кредита в мес.
        c = 9.99; // процентная ставка в %
        System.out.printf("\n Сумма кредита: %,d руб. \n Срок кредита: %s мес.  \n Процентная ставка: %s %% \n", a, b, c);
        System.out.printf("Ежемесячный платёж: %,d руб.\n", service.calculate(a, b, c));
    }
}