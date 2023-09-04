package github.alex.redfearn.littlelambda;

public class Main {
  public static void main(String[] args) {
    new Person("Mary").had(3, () -> System.out.println("little lambda"));
  }
}