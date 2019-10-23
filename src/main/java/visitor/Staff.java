package visitor;

public abstract class Staff {

  protected String name;

  public void print() {
    System.err.println("I am a staff.");
  }

  public abstract void accept(Visitor visitor);
}
