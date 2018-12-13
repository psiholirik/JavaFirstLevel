public class Lesson6 {
  public static void main(String[] args) {
    Cat cat = new Cat();
    Greyhound greyhound = new Greyhound();
    Chihua chihua = new Chihua();

    cat.run(200);
    cat.run(201);
    cat.swim(20);
    cat.jump(2);
    cat.jump(3);

    greyhound.run(1000);
    greyhound.run(1001);
    greyhound.swim(350);
    greyhound.swim(351);
    greyhound.jump(2);
    greyhound.jump(3);

    chihua.run(20);
    chihua.run(21);
    chihua.swim(2);
    chihua.swim(3);
    chihua.jump(1);
    chihua.jump(2);
  }
}
