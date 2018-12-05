/**
 * Java 1. Lesson 5. OOP
 *
 * @author Artem Rubtsov
 * @version dated Dec 05, 2018
 */

public class Person {
  private String fullName;
  private String position;
  private String email;
  private String phone;
  private int salary;
  private int age;

  public Person(String fullName, String position, String email, String phone, int salary, int age) {
    this.fullName = fullName;
    this.position = position;
    this.email = email;
    this.phone = phone;
    this.salary = salary;
    this.age = age;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "fullName='" + fullName + '\'' +
            ", position='" + position + '\'' +
            ", email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            ", salary=" + salary +
            ", age=" + age +
            '}';
  }

  public void printPerson(Person person) {
    System.out.println(person.toString());
  }
}
