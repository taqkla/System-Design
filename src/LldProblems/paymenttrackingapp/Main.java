package LldProblems.paymenttrackingapp;

import static LldProblems.paymenttrackingapp.model.Currency.USD;

import LldProblems.paymenttrackingapp.model.Amount;
import LldProblems.paymenttrackingapp.model.BalanceMap;
import LldProblems.paymenttrackingapp.model.Expense;
import LldProblems.paymenttrackingapp.model.Group;
import LldProblems.paymenttrackingapp.service.ExpenseService;
import LldProblems.paymenttrackingapp.service.GroupService;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

  public static void main(String[] args) throws IllegalAccessException {
    final ExpenseService expenseService = constructExpenseService();
    final HashMap<String, Group> groups = getGroups();
    GroupService groupService = new GroupService(expenseService, groups);
    final var balances = groupService.getBalances("123", "A");
    final var balanceMap = balances.getBalances();
    // It should be 50.0
    System.out.println("A will get the amount = " + balanceMap.get("A").getAmount());
    // It should be 30.0
    System.out.println("B will get the amount = " + balanceMap.get("B").getAmount());
    // It should be -80.0
    System.out.println("C will owe the amount = " +  balanceMap.get("C").getAmount());
  }

  private static HashMap<String, Group> getGroups() {
    final var groups = new HashMap<String, Group>();
    final var userList = new ArrayList<String>();
    userList.add("A");
    userList.add("B");
    userList.add("C");
    groups.put("123", new Group("Europe", "Euro trip",
        "https://www.google.com/imgres?q=splitwise%20group%20images&imgurl=https%3A%2F%2Fplay-lh.googleusercontent.com%2F0MKv7lYaEMPidLqTcxfWVguYdAPdPYsDi20F9Q5RLmOHEhXqwatScXPx7MXS6LEleQ%3Dw526-h296-rw&imgrefurl=https%3A%2F%2Fplay.google.com%2Fstore%2Fapps%2Fdetails%3Fid%3Dcom.Splitwise.SplitwiseMobile&docid=6Xmg6_K5EkuoYM&tbnid=8aaqleLp0EFomM&vet=12ahUKEwjikf-8-OqKAxW14zgGHUTzIDcQM3oFCIUBEAA..i&w=166&h=296&hcb=2&ved=2ahUKEwjikf-8-OqKAxW14zgGHUTzIDcQM3oFCIUBEAA",
        userList));
    return groups;
  }

  private static ExpenseService constructExpenseService() {
    final var expenseService = new ExpenseService();
    final var firstExpense = new BalanceMap();
    firstExpense.getBalances().put("A", new Amount(USD, 10));
    firstExpense.getBalances().put("B", new Amount(USD, 20));
    firstExpense.getBalances().put("C", new Amount(USD, -30));
    expenseService.addExpense(new Expense(firstExpense,
        "outing1",
        "https://www.google.com/search?q=splitwise+group+images&sca_esv=5eec4df861aac159&udm=2&biw=1512&bih=778&sxsrf=ADLYWIK7kwKCbLIRuoeDmjzhjeCT2MFhhA%3A1736504785575&ei=0fWAZ8bhIoaR4-EP26vauA8&ved=0ahUKEwiGjpS3-OqKAxWGyDgGHduVFvcQ4dUDCBE&uact=5&oq=splitwise+group+images&gs_lp=EgNpbWciFnNwbGl0d2lzZSBncm91cCBpbWFnZXNIvTxQoiNYhzpwAXgAkAEAmAGhAaABgwmqAQQxMi4xuAEDyAEA-AEBmAIIoALmBMICDRAAGIAEGLEDGEMYigXCAgYQABgHGB7CAgUQABiABMICCBAAGIAEGLEDwgIKEAAYgAQYQxiKBcICBBAAGB6YAwCIBgGSBwE4oAeTJw&sclient=img#vhid=8aaqleLp0EFomM&vssid=mosaic",
        "outing 1", "123"));
    final var secondExpense = new BalanceMap();
    secondExpense.getBalances().put("A", new Amount(USD, -50));
    secondExpense.getBalances().put("B", new Amount(USD, 10));
    secondExpense.getBalances().put("C", new Amount(USD, 40));
    expenseService.addExpense(new Expense(secondExpense,
        "outing2",
        "https://www.google.com/search?q=splitwise+group+images&sca_esv=5eec4df861aac159&udm=2&biw=1512&bih=778&sxsrf=ADLYWIK7kwKCbLIRuoeDmjzhjeCT2MFhhA%3A1736504785575&ei=0fWAZ8bhIoaR4-EP26vauA8&ved=0ahUKEwiGjpS3-OqKAxWGyDgGHduVFvcQ4dUDCBE&uact=5&oq=splitwise+group+images&gs_lp=EgNpbWciFnNwbGl0d2lzZSBncm91cCBpbWFnZXNIvTxQoiNYhzpwAXgAkAEAmAGhAaABgwmqAQQxMi4xuAEDyAEA-AEBmAIIoALmBMICDRAAGIAEGLEDGEMYigXCAgYQABgHGB7CAgUQABiABMICCBAAGIAEGLEDwgIKEAAYgAQYQxiKBcICBBAAGB6YAwCIBgGSBwE4oAeTJw&sclient=img#vhid=8aaqleLp0EFomM&vssid=mosaic",
        "outing 2", "123"));
    final var thirdExpense = new BalanceMap();
    thirdExpense.getBalances().put("A", new Amount(USD, 90));
    thirdExpense.getBalances().put("C", new Amount(USD, -90));
    expenseService.addExpense(new Expense(thirdExpense,
        "outing3",
        "https://www.google.com/search?q=splitwise+group+images&sca_esv=5eec4df861aac159&udm=2&biw=1512&bih=778&sxsrf=ADLYWIK7kwKCbLIRuoeDmjzhjeCT2MFhhA%3A1736504785575&ei=0fWAZ8bhIoaR4-EP26vauA8&ved=0ahUKEwiGjpS3-OqKAxWGyDgGHduVFvcQ4dUDCBE&uact=5&oq=splitwise+group+images&gs_lp=EgNpbWciFnNwbGl0d2lzZSBncm91cCBpbWFnZXNIvTxQoiNYhzpwAXgAkAEAmAGhAaABgwmqAQQxMi4xuAEDyAEA-AEBmAIIoALmBMICDRAAGIAEGLEDGEMYigXCAgYQABgHGB7CAgUQABiABMICCBAAGIAEGLEDwgIKEAAYgAQYQxiKBcICBBAAGB6YAwCIBgGSBwE4oAeTJw&sclient=img#vhid=8aaqleLp0EFomM&vssid=mosaic",
        "outing 3", "123"));
    return expenseService;
  }
}
