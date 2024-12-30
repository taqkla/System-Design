package DesignPatterns.prototype.solution;

public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {

    UserDirectory userDirectory = new UserDirectory();
    userDirectory.setDId("" + 1);
    userDirectory.loadUsers();
    System.out.println(userDirectory);

    UserDirectory userDirectory2 = (UserDirectory) userDirectory.clone();
    userDirectory.setDId("" + 2);
    userDirectory.loadUsers();
    System.out.println(userDirectory2);


  }
}
