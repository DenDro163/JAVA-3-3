public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double paymentYear = service.calculate(1000000, 9.99, 1);
        System.out.println((int) paymentYear);
        double payment2Years = service.calculate(1000000, 9.99, 2);
        System.out.println((int) payment2Years);
        double payment3Years = service.calculate(1000000, 9.99, 3);
        System.out.println((int) payment3Years);
    }
}
