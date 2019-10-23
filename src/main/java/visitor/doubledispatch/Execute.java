package visitor.doubledispatch;

public class Execute {

  public void print(Father father) {
    System.err.println("I am father");
  }

  public void print(Son son) {
    System.err.println("I am son");
  }

  public static void main(String[] args) {
    Father father = new Father();
    Father son = new Son();
    Execute exe = new Execute();
    exe.print(father);
    exe.print(son);
  }
}
