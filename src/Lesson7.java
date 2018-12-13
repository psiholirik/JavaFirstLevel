/**
 * Java 1. Lesson 7
 *
 * @author Artem Rubtsov
 * @version dated Dec 13, 2018
 */

public class Lesson7 {
  public static void main(String[] args) {
    Cats[] cats = new Cats[3];
    Plate plate = new Plate(100);

    cats[0] = new Cats("Барсик", 120);
    cats[1] = new Cats("Васька", 35);
    cats[2] = new Cats("Тяпка", 40);

    for (Cats cat : cats) {
      cat.eat(plate, cat);
      cat.satietyInfo();
    }

    plate.info();
    plate.addFood(40);
    plate.info();
  }
}

