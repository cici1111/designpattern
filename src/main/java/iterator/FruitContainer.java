package iterator;

public class FruitContainer implements Container {

  private String[] fruits = new String[]{"apple", "banana", "pear", "grape"};

  @Override
  public Iterator getIterator() {
    return new FruitIterator();
  }

  private class FruitIterator implements Iterator {

    int index;

    @Override
    public boolean hasNext() {
      return index < fruits.length;
    }

    @Override
    public Object next() {
      return fruits[index++];
    }
  }

  public static void main(String[] args) {
    FruitContainer fruitContainer = new FruitContainer();
    Iterator iterator = fruitContainer.getIterator();
    while (iterator.hasNext()) {
      System.err.println(iterator.next());
    }
  }
}
