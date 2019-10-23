package memento;

import bridge.RedColor;

public class Caretaker {

  private Record record;

  public void save(Record record) {
    this.record = record;
  }
}
