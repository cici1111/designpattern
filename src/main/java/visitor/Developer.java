package visitor;

public class Developer extends Staff {

  public Developer(String name) {
    this.name = name;
  }

  @Override
  public void print() {
    System.err.println("I am developer.");
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
