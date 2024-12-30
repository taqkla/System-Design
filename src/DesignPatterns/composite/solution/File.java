package DesignPatterns.composite.solution;

//Singular class
public class File implements FileSystem {

  private float size;

  public File(float size) {
    this.size = size;
  }

  public float getSize() {
    return this.size;
  }
}
