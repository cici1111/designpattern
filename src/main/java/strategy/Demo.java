package strategy;

public class Demo {

  public static void main(String[] args) {
    Context context = new Context();
    context.setParameters(1, 2);
    context.setOperation(new Add());
    System.err.println(context.getResult());
  }
}
