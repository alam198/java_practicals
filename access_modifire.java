public class access_modifire {

  public void public_access() {
    System.out.println("this is public access modifier ");
  }

  private void private_access() {
    System.out.println("this is private modifier ");
  }

  void defult_accesss() {
    System.out.println("this is defult modifier ");
    private_access();
  }

  protected void protected_accesss() {
    System.out.println("this is protected modifier ");
  }

  public static void main(String[] args) {

    another_class saz = new another_class();
    saz.display();

  }
}

class another_class {
  void display() {
    access_modifire modifier = new access_modifire();

    modifier.public_access();
    // modifier.private_access(); // private class never use another class private
    // class use in same class
    modifier.defult_accesss();
    modifier.protected_accesss();
    ;

  }

}
