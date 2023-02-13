public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // double credit = 1000000; // Сумма кредита
        // double percent = 9.99; // Процентная ставка
        // double quantity = 12; // Количество платежей

        // double payment = (int) service.calculate(credit, percent, quantity);
        // System.out.println(payment);

        System.out.println();
        System.out.println("При сроке кредита 1 год, ежемесячный платеж составит:");
        System.out.println(service.calculate(1000000, 9.99, 12) + " рублей в месяц");

        System.out.println();
        System.out.println("При сроке кредита 2 года, ежемесячный платеж составит:");
        System.out.println(service.calculate(1000000, 9.99, 24) + " рублей в месяц");

        System.out.println();
        System.out.println("При сроке кредита 3 года, ежемесячный платеж составит:");
        System.out.println(service.calculate(1000000, 9.99, 36) + " рублей в месяц");

    }
}