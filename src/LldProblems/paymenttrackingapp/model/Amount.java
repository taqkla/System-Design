package LldProblems.paymenttrackingapp.model;

public class Amount {

  private final Currency currency;
  private final double amount; // if it's negative -- give, positive - get

  public Amount(Currency currency, double amount) {
    this.currency = currency;
    this.amount = amount;
  }

  public Amount add(Amount amount) {
    return new Amount(currency, this.amount + amount.amount);
  }

  public Currency getCurrency() {
    return currency;
  }

  public double getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    return "Amount{" +
        "currency=" + currency +
        ", amount=" + amount +
        '}';
  }
}
