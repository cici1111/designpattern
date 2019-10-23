package strategy;

public class Context {

  private Operation operation;
  private int n1;
  private int n2;

  public void setOperation(Operation operation) {
    this.operation = operation;
  }

  public void setParameters(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;
  }

  public int getResult() {
    return operation.doOperation(n1, n2);
  }
}
