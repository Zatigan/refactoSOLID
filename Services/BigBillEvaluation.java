package Services;

public class BigBillEvaluation {
    boolean isBigBill(double invoice, int BIGBILL_VALUE) {
        return invoice > BIGBILL_VALUE;
    }

}
