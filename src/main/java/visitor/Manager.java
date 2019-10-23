package visitor;

public class Manager extends Staff {

  public Manager(String name) {
    this.name = name;
  }

  @Override
  public void print() {
    System.err.println("I am manager.");
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
