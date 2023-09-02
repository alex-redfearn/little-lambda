package github.alex.redfearn.littlelambda;

public class LittleLambda {

  public static void repeat(int n, Runnable rhyme) {
    System.out.println("Mary had a...");
    for (int i = 0; i < n; i++) {
      rhyme.run();
    }
  }

}
