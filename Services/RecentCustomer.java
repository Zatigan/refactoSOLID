package Services;

import ValueModifiers.DiscountValues;

public class RecentCustomer implements State {

 @Override
 public double discount(boolean bigBill) {
  return DiscountValues.RECENT_DISCOUNT;
 }
}
