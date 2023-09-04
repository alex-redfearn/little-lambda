package github.alex.redfearn.littlelambda;

public class Person {

  private final String name;

  public Person(String name) {
    this.name = name;
  }

  public void had(int n, Runnable rhyme) {
    System.out.printf("%s had a...", this.name);
    for (int i = 0; i < n; i++) {
      rhyme.run();
    }
  }

}
