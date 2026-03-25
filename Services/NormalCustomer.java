package Services;

import ValueModifiers.DiscountValues;

public class NormalCustomer implements State {

 @Override
 public double discount(boolean bigBill) {
  if (bigBill) {
   return DiscountValues.NORMAL_BIGBILL_DISCOUNT;
  } else {
   return DiscountValues.NORMAL_DISCOUNT;
  }
 }
}