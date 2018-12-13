/**
 * Java 1. Lesson 7
 *
 * @author Artem Rubtsov
 * @version dated Dec 13, 2018
 */
public class Plate {
  private int food;

  public Plate(int food) {
    this.food = food;
  }

  public void info() {
    System.out.println("Осталось еды: " + food);
  }

  public void decreaseFood(int n, Cats cats) {
    if(food - n > 0) {
      food -= n;
      cats.setSatiety(true);
    }
  }

  public void addFood(int quantity) {
    if(quantity > 0) {
      food += quantity;
    }
  }
}
