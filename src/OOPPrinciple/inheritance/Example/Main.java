package OOPPrinciple.inheritance.Example;

public class Main {

  public static void main(String[] args) {
    SavingAccount account1 = new SavingAccount("123", 10);
    CurrentAccount account2 = new CurrentAccount("456", 12);

    System.out.println(account1.getBalance());
    System.out.println(account2.getBalance());
    account1.deposit(123);
    account2.deposit(321);

    account1.addInterest();
    account2.addInterest();

    System.out.println(account1.getBalance());
    System.out.println(account2.getBalance());
  }
}
