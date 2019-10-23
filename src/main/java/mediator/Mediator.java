package mediator;

public abstract class Mediator {

  abstract void broadcast(String message);

  abstract void register(Player player);
}
