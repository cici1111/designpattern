package bridge;

public class SmallPen extends Pen {

  private Color color;

  public SmallPen(Color color) {
    this.color = color;
  }

  @Override
  public void draw() {
    System.err.println("This is small pen.");
    this.color.print();
  }

  public static void main(String[] args) {
    RedColor redColor = new RedColor();
    SmallPen smallPen = new SmallPen(redColor);
    smallPen.draw();
  }
}
