package DesignPatterns.Structural.composite.problem;

/**
 * Composite Pattern is a structural design pattern that allows composing objects into a tree like
 * structure and work with it as if it is a singular object.
 * Problem: You want to determine the size of all files and subFolders inside a folder.
 */
public class Client {

  public static void main(String[] args) {
    Folder root = new Folder(0.5f);
    root.addFile(new File(10f));
    root.addFile(new File(2f));
    root.addFile(new File(5f));
    Folder subFolder1 = new Folder(0f);
    Folder subFolder2 = new Folder(0f);
    Folder subFolder3 = new Folder(0f);
    subFolder3.addFile(new File(8f));
    subFolder2.addSubFolder(subFolder3);
    subFolder2.addFile(new File(3f));
    subFolder1.addSubFolder(subFolder2);
    root.addSubFolder(subFolder1);

    System.out.println(root.getSize());

  }
}
