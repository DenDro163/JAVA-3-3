public class CreditPaymentService {
    public double calculate(int amount, double interest, int term) {
        double interestPerMonth = interest / 12 / 100;// Расчет ежемесячной процентной ставки
        double percent = Math.pow((1 + interestPerMonth), (term * 12));// Проценты за срок кредита
        return ((interestPerMonth * amount * percent)) / (percent - 1);//Величина периодической выплаты


    }
}
