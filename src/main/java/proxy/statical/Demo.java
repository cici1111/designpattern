package proxy.statical;

public class Demo {

  public static void main(String[] args) {
    IActionService actionService = new ActionService();
    ActionServiceProxy proxy = new ActionServiceProxy(actionService);
    proxy.doAction();
  }
}
