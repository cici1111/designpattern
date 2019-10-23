package visitor;

public class CEO implements Visitor {

  @Override
  public void visit(Developer developer) {
    developer.print();
  }

  @Override
  public void visit(Manager manager) {
    manager.print();
  }
}
