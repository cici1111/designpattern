package adapter;

public class InstanceAdapter extends InstanceTarget {

  private InstanceSource instanceSource = new InstanceSource();

  @Override
  public String targetMethod() {
    return instanceSource.sourceMethod();
  }

  public static void main(String[] args) {
    InstanceAdapter instanceAdapter = new InstanceAdapter();
    System.err.println(instanceAdapter.targetMethod());
  }
}
