package decorator;

public class Star implements TreeDecorator {
  private TreeDecorator decorator;

  public Star(TreeDecorator decorator) {
    this.decorator = decorator;
  }

  @Override
  public void decorate() {
    decorator.decorate();
    System.err.println("The tree has star");
  }
}
