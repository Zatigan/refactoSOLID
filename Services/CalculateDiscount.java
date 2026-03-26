package Services;

import Models.CustomerTypes;
import ValueModifiers.DiscountValues;

public class CalculateDiscount {

 double calculateDiscount(CustomerTypes customerType, double invoice, int BIGBILL_VALUE) {

  boolean isBigPurchase = invoice > BIGBILL_VALUE;
  double discount = invoice * DiscountValues.DEFAULT_DISCOUNT;

  switch (customerType) {
   case VIP:
    if (isBigPurchase) {
     discount = invoice * DiscountValues.VIP_BIGBILL_DISCOUNT;
    } else {
     discount = invoice * DiscountValues.VIP_DISCOUNT;
    }
    break;
   case NORMAL:
    if (isBigPurchase) {
     discount = invoice * DiscountValues.NORMAL_BIGBILL_DISCOUNT;
    }
    break;
   case NEW:
    discount = invoice * DiscountValues.RECENT_DISCOUNT;
    break;
  }
  return discount;
 }
}
