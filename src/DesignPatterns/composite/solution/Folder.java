package DesignPatterns.composite.solution;

import java.util.ArrayList;

// Composite class
public class Folder implements FileSystem {

  private float size;
  private ArrayList<FileSystem> children;

  public Folder(float size) {
    this.size = size;
    this.children = new ArrayList<>();
  }

  public float getSize() {
    // Add the logic to get size from all files and subFolders.
    float totalSize = 0f;
    for (FileSystem child : this.children) {
      totalSize += child.getSize();
    }
    return totalSize + this.size;
  }

  public void addChild(FileSystem child) {
    this.children.add(child);
  }
}
