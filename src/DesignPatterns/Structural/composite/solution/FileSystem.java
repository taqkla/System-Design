package DesignPatterns.Structural.composite.solution;

import java.util.ArrayList;
import java.util.List;

public abstract class FileSystem {

  private ArrayList<FileSystem> childs;

  private final float size;

  protected FileSystem(float size) {
    this.childs = new ArrayList<>();
    this.size = size;
  }


  public float getSize() {
    float totalSize = this.size;
    for (int i = 0; i < childs.size(); i++) {
      totalSize += childs.size();
    }
    return totalSize;
  }

  public void addChilds(List<FileSystem> childs) {
    this.childs.addAll(childs);
  }
}
