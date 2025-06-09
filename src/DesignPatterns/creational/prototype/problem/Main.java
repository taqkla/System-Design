package DesignPatterns.creational.prototype.problem;

public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {

    // 1s
    UserDirectory userDirectory = new UserDirectory();
    userDirectory.setDId("" + 1);
    userDirectory.loadUsers(); // 1s
    System.out.println(userDirectory.hashCode());
    // 1s

    // UserDirectory ud2 = new UserDirectory();

    UserDirectory ud2 = userDirectory.clone();
    userDirectory.setDId("" + 5);
    System.out.println(userDirectory);
    System.out.println(ud2);
    System.out.println(ud2.hashCode());

    // shallow copy -- create another reference of the same object,
    // deep copy -- create a different object with the same values

    UserDirectory userDirectory2 = new UserDirectory();
    userDirectory.setDId("" + 1);
    userDirectory.loadUsers();
    System.out.println(userDirectory2.hashCode());


  }
}
