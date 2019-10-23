package state;

public class Context {

  private State state;

  public void doAction() {
    state.handle(this);
  }

  public void setState(State state) {
    this.state = state;
    doAction();
  }

  public State getState() {
    return state;
  }
}
