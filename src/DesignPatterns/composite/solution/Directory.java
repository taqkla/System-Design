package DesignPatterns.composite.solution;

import DesignPatterns.composite.problem.File;
import DesignPatterns.composite.problem.Folder;
import java.util.ArrayList;

// Composite class
public class Directory implements FileSystem {

  private final float size;

  private final ArrayList<FileSystem> children;

  Directory(float size) {
    this.size = 0.1f;
    this.children = new ArrayList<>();
  }


  public float getSize() {
    float totalSize = 0;
    for (FileSystem child : this.children) {
      totalSize += child.getSize();
    }
    return totalSize + this.size;
  }

  public void addChild(FileSystem child) {
    this.children.add(child);
  }

}
