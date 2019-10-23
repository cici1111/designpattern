package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

  private List<Observer> observerList = new ArrayList<>();

  public void register(Observer observer) {
    observerList.add(observer);
  }

  private void publish(final String message) {
    observerList.parallelStream().forEach(observer -> observer.print(message));
  }

  public void updateMessage(String message) {
    publish(message);
  }
}
