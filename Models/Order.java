package Models;

public class Order {

 private CustumerTypes customerType;
 private double invoice;
 private int itemQuantity;
 private boolean isShippedAbroad;

 public Order(CustumerTypes customerType, double invoice, int itemQuantity, boolean isShippedAbroad) {
  this.customerType = customerType;
  this.invoice = invoice;
  this.itemQuantity = itemQuantity;
  this.isShippedAbroad = isShippedAbroad;
 }

 public CustumerTypes getCustomerType() {
  return customerType;
 }

 public void setCustomerType(CustumerTypes customerType) {
  this.customerType = customerType;
 }

 public double getInvoice() {
  return invoice;
 }

 public void setInvoice(double invoice) {
  this.invoice = invoice;
 }

 public int getItemQuantity() {
  return itemQuantity;
 }

 public void setItemQuantity(int itemQuantity) {
  this.itemQuantity = itemQuantity;
 }

 public boolean isShippedAbroad() {
  return isShippedAbroad;
 }

 public void setShippedAbroad(boolean isShippedAbroad) {
  this.isShippedAbroad = isShippedAbroad;
 }

 

}
