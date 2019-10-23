package observer;

public class Demo {

  public static void main(String[] args) {
    Subject subject = new Subject();
    subject.register(new Observer("AA"));
    subject.register(new Observer("BB"));
    subject.register(new Observer("CC"));

    subject.updateMessage("The weather is good!");
  }
}
