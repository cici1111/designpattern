package proxy.statical;

public class ActionServiceProxy implements IActionService {

  private IActionService actionService;

  public ActionServiceProxy(IActionService actionService) {
    this.actionService = actionService;
  }

  @Override
  public void doAction() {
    actionService.doAction();
  }
}
