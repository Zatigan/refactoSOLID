package Services;

import ValueModifiers.DiscountValues;

public class VipCustomer implements State {

 @Override
 public double discount(boolean bigBill) {
  if (bigBill) {
   return DiscountValues.VIP_BIGBILL_DISCOUNT;
  } else {
   return DiscountValues.VIP_DISCOUNT;
  }
 }
}
