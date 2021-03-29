public class CreditPaymentService {
    public double calculate(int amount, int months, double percents){
        double monthPercents = percents/100/12;
        double payment = amount*Math.pow((1+monthPercents),months)*monthPercents/(Math.pow((1+monthPercents),months)-1);
        return payment;
    }
}
