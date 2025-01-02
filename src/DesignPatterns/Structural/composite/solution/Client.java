package DesignPatterns.Structural.composite.solution;

public class Client {

  public static void main(String[] args) {

    Directory root = new Directory(0.5f);
    root.addChild(new File(10f));
    root.addChild(new File(2f));
    root.addChild(new File(5f));
    Folder subFolder1 = new Folder(0f);
    Folder subFolder2 = new Folder(0f);
    Folder subFolder3 = new Folder(0f);
    subFolder3.addChild(new File(8f));
    subFolder2.addChild(subFolder3);
    subFolder2.addChild(new File(3f));
    subFolder1.addChild(subFolder2);
    root.addChild(subFolder1);

    System.out.println(root.getSize());

  }
}
