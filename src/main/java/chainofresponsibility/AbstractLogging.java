package chainofresponsibility;

public abstract class AbstractLogging {

  public static int WARNING = 1;
  public static int CRITICAL = 2;
  public static int FATAL = 3;

  protected int level;

  private AbstractLogging next;

  public void log(int level, String message) {
    if (this.level >= level) {
      write(message);
    }

    if (next != null) {
      next.log(level, message);
    }
  }

  public void setNext(AbstractLogging logging) {
    this.next = logging;
  }

  public abstract void write(String message);
}
