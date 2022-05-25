public class CreditPaymentService {
    public double calculate(double sum, int time, double percent) {

        double stake = (percent / 100) / 12; //ставка в месяц
        double annuity = stake * Math.pow((1 + stake), time) / (Math.pow((1 + stake), time) - 1); //коэффициент аннуитета
        double payment = annuity * sum;

        return payment;
    }
}
