/**
 * Java 1. Lesson 7
 *
 * @author Artem Rubtsov
 * @version dated Dec 13, 2018
 */
public class Cats {
  private String name;
  private int appetite;
  private boolean satiety;

  public Cats(String name, int appetite) {
    this.name = name;
    this.appetite = appetite;
  }

  public void eat(Plate plate, Cats cats) {
    plate.decreaseFood(cats.appetite, cats);
  }

  public void setSatiety(boolean satiety) {
    this.satiety = satiety;
  }

  public void satietyInfo() {
    System.out.println(name + " наелся: " + satiety);
  }
}
