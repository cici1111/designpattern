package state;

public class TurnOff implements State {

  @Override
  public void handle(Context context) {
    System.err.println("Turn off.");
  }
}
