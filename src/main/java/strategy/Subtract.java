package strategy;

public class Subtract implements Operation {

  @Override
  public int doOperation(int n1, int n2) {
    return n1 - n2;
  }
}
