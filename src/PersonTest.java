/**
 * Java 1. Lesson 5. OOP
 *
 * @author Artem Rubtsov
 * @version dated Dec 05, 2018
 */

public class PersonTest {
  public static void main(String[] args) {
    Person[] persArray = new Person[5];
    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
            "892312312", 30000, 40);
    persArray[1] = new Person("Petrov Petr", "Middle Engineer", "petrov@mailbox.com",
            "4232316621", 130000, 29);
    persArray[2] = new Person("Ignatov Ignat", "Senior Engineer", "ignatov@mailbox.com",
            "1236216326", 150000, 60);
    persArray[3] = new Person("Borisov Boris", "Junior Engineer", "borisov@mailbox.com",
            "1236213621", 25000, 41);
    persArray[4] = new Person("Nikolaev Nikolay", "PO", "nikolaev@mailbox.com",
            "6346146141", 200000, 50);

    for (int i = 0; i < persArray.length; i++) {
      if (persArray[i].getAge() > 40) {
        persArray[i].printPerson(persArray[i]);
      }
    }
  }
}
