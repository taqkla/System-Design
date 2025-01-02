package DesignPatterns.Structural.composite.problem;

import java.util.ArrayList;

public class Directory {

  private final float size;

  private final ArrayList<File> files;
  private final ArrayList<Folder> folders;
  private final ArrayList<Directory> subDirectories;

  Directory(float size) {
    this.size = 0.1f;
    this.files = new ArrayList<>();
    this.folders = new ArrayList<>();
    this.subDirectories = new ArrayList<>();
  }


  float getSize() {
    float totalSize = 0;
    // for loop to calcuate the size of sub directories
    // for loop to calcuate the size of files
    // for loop to calcuate the size of folder
    return totalSize + this.size;
  }


}
