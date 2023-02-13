public class CreditPaymentService {

    public double calculate(double credit, double percent, double quantity) {
        double rate = (percent / 12 / 100); //Месячная процентная ставка
        double a1 = 1 + rate; // Переменная для возведения в степень
        double a2 = Math.pow(a1, quantity); // Переменная, возведенная в степень для формулы
        double annuity = (rate * a2) / (a2 - 1); // Коэффициент аннуитета
        double payment = (int) (credit * annuity); // Ежемесячный платеж

        return payment;


    }
}