package Services;

import ValueModifiers.DiscountValues;

public interface discountEvaluation {
    static double processEvaluation(double invoice, boolean bigBill) {
        return invoice * DiscountValues.DEFAULT_DISCOUNT;
    }
}
