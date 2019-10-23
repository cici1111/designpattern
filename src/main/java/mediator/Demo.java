package mediator;

public class Demo {

  public static void main(String[] args) {
    Mediator mediator = new GlobalMediator();
    Player player = new Player("Play A");
    mediator.register(player);
    mediator.register(new Player("Play B"));
    mediator.register(new Player("Play C"));
    mediator.register(new Player("Play D"));

    player.say("Hello!", mediator);
  }
}
