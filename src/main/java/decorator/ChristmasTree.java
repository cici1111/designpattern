package decorator;

public class ChristmasTree implements TreeDecorator {

  @Override
  public void decorate() {
    System.err.println("This is Christmas tree!");
  }

  public static void main(String[] args) {
    ChristmasTree christmasTree = new ChristmasTree();
    Star star = new Star(christmasTree);
    star.decorate();
  }
}
