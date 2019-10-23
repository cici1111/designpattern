package singleton;

public class Earth {

  private Earth() {
  }

  private static class EarthHolder {

    public static Earth instance = new Earth();
  }

  public static Earth getInstance() {
    return EarthHolder.instance;
  }
}
