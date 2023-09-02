package github.alex.redfearn.littlelambda;

public class Main {
  public static void main(String[] args) {
    LittleLambda.repeat(3, () -> System.out.println("little lambda"));
  }
}