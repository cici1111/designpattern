package state;

public class Demo {

  public static void main(String[] args) {
    TurnOff turnOff = new TurnOff();
    Context context = new Context();
    context.setState(turnOff);
  }
}
