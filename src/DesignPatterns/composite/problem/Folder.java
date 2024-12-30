package DesignPatterns.composite.problem;

import java.util.ArrayList;

/**
 * Composite class.
 */
public class Folder {

  private final float size;
  private final ArrayList<File> files;
  private final ArrayList<Folder> subFolders;

  public Folder(float size) {
    this.size = size;
    this.files = new ArrayList<>();
    this.subFolders = new ArrayList<>();
  }

  public float getSize() {
    // Add the logic to get size from all files and subFolders.
    float totalSize = 0f;
    for (File file : this.files) {
      totalSize += file.getSize();
    }
    for (Folder subFolder : this.subFolders) {
      totalSize += subFolder.getSize();
    }
    return totalSize + this.size;
  }

  public void addFile(File file) {
    this.files.add(file);
  }

  public void addSubFolder(Folder subFolder) {
    this.subFolders.add(subFolder);
  }
}
