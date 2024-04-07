public class practical {
  private int number;

  public practical() {
    number = 0;

  }

  public practical(int num) {
    number = num;

  }

  public practical(practical obj) {
    number = obj.number;

  }

  public void display() {
    System.out.println("number :" + number);
  }

  public static void main(String[] args) {
    // construtor

    practical obj1 = new practical();
    practical obj2 = new practical(10);
    practical obj3 = new practical(obj2);

    obj1.display();
    obj2.display();
    obj3.display();

  }
}
