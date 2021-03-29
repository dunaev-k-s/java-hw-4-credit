//Знаю в финансовых расчетах нужно использовать BigDecimal, но пока сложно.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double paymentOne = service.calculate(1_000_000, 12, 9.99);
        double paymentTwo = service.calculate(1_000_000, 24, 9.99);
        double paymentThree = service.calculate(1_000_000, 36, 9.99);
        System.out.println("Платеж для срока 12 месяцев = " + String.format("%.0f", paymentOne));
        System.out.println("Платеж для срока 24 месяцев = " + String.format("%.0f", paymentTwo));
        System.out.println("Платеж для срока 36 месяцев = " + String.format("%.0f", paymentThree));
    }
}
