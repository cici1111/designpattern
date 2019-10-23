package state;

public class TurnOn implements State {

  @Override
  public void handle(Context context) {
    System.err.println("Turn on.");
  }
}
