package prototype;

import lombok.Getter;

@Getter
public class Mail implements Cloneable {

  private String name;
  private String address;

  public Mail(String name, String address) {
    this.name = name;
    this.address = address;
  }

  @Override
  protected Mail clone() throws CloneNotSupportedException {
    Mail mail1 = (Mail) super.clone();
    return mail1;
  }

  public static void main(String[] args) throws Exception {
    Mail mail = new Mail("Welson", "welson.yang@quest.com");
    Mail mail1 = mail.clone();
    System.err.println("1=============" + mail1.getName());
  }
}
