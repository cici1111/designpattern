package observer;

public class Observer {

  private String name;

  public Observer(String name) {
    this.name = name;
  }

  public void print(String message) {
    System.err.println(System.currentTimeMillis() + " " + name + " get message: " + message);
  }
}
