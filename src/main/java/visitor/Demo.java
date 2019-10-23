package visitor;

import java.util.LinkedList;
import java.util.List;

public class Demo {

  private List<Staff> mStaffs = new LinkedList<>();

  public Demo() {
    mStaffs.add(new Manager("经理-A"));
    mStaffs.add(new Developer("工程师-A"));
    mStaffs.add(new Developer("工程师-B"));
    mStaffs.add(new Developer("工程师-C"));
    mStaffs.add(new Manager("经理-B"));
    mStaffs.add(new Developer("工程师-D"));
  }

  public void print(Visitor visitor) {
    //Come not compile
//    mStaffs.forEach(staff -> visitor.visit(staff));
    mStaffs.forEach(staff -> staff.accept(visitor));
  }

  public static void main(String[] args) {
    CEO ceo = new CEO();
    Demo demo = new Demo();
    demo.print(ceo);
  }
}
