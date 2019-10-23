package mediator;

import java.util.ArrayList;
import java.util.List;

public class GlobalMediator extends Mediator {

  List<Player> list = new ArrayList();

  @Override
  void broadcast(final String message) {
    list.forEach(it -> it.header(message));
  }

  @Override
  void register(Player player) {
    list.add(player);
  }
}
