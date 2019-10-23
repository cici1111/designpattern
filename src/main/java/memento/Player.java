package memento;

public class Player {

  private String status;

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public Record createRecord() {
    Record record = new Record();
    record.setStatus(this.status);

    return record;
  }

  public void recall(Record record) {
    this.status = record.getStatus();
  }
}
