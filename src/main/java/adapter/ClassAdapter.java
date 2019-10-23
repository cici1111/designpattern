package adapter;

public class ClassAdapter extends ClassSource implements ClassTarget {

  @Override
  public String targetMethod() {
    return super.sourceMethod();
  }

  public static void main(String[] args) {
    ClassTarget classTarget = new ClassAdapter();
    System.err.println(classTarget.targetMethod());
  }
}
