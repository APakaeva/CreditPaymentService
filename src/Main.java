public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double sum = 1_000_000; // сумма кредита
        int time = 12; // на сколько кредит
        double percent = 9.99; // процент кредита
        double payment = service.calculate(sum, time, percent);

        System.out.println("Сумма ежемесячного платежа - " + service.calculate(sum, 12, percent));
        System.out.println("Сумма ежемесячного платежа - " + service.calculate(sum, 24, percent));
        System.out.println("Сумма ежемесячного платежа - " + service.calculate(sum, 36, percent));
    }
}
