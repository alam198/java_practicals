public class overloading {
  // Method to add two integers
  public int add(int a, int b) {
    return a + b;
  }

  // Method to add three integers
  public int add(int a, int b, int c) {
    return a + b + c;
  }

  // Method to add two doubles
  public double add(double a, double b) {
    return a + b;
  }

  // Method to concatenate two strings
  public String add(String a, String b) {
    return a + b;
  }

  public static void main(String[] args) {
    overloading math = new overloading();

    // Calling overloaded methods
    System.out.println("Sum of 5 and 10: " + math.add(5, 10)); // Output: 15
    System.out.println("Sum of 5, 10, and 15: " + math.add(5, 10, 15)); // Output: 30
    System.out.println("Sum of 3.5 and 2.5: " + math.add(3.5, 2.5)); // Output: 6.0
    System.out.println("Concatenation of 'Hello' and 'World': " + math.add("Hello", "World")); // Output: HelloWorld
  }
}
