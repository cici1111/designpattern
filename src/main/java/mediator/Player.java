package mediator;

public class Player {

  private String name;

  public Player(String name) {
    this.name = name;
  }

  void say(String message, Mediator mediator) {
    mediator.broadcast(message);
  }

  void header(String message) {
    System.err.println(name + " header: " + message);
  }
}
