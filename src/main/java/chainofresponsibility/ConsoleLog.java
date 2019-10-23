package chainofresponsibility;

public class ConsoleLog extends AbstractLogging {

  public ConsoleLog() {
    this.level = AbstractLogging.FATAL;
  }

  @Override
  public void write(String message) {
    System.err.println("Console Log: " + message);
  }
}
