package Services;

import ValueModifiers.DiscountValues;

public class VipBigDiscount implements discountEvaluation {
    static double processEvaluation(double invoice) {
        return invoice * DiscountValues.VIP_BIGBILL_DISCOUNT;
    }
}
