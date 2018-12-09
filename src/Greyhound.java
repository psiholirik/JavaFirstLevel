public class Greyhound implements Dog{
  @Override
  public void run(int length) {
    if (length <= 1000 && length > 0) {
      System.out.println("run: " + true);
    } else {
      System.out.println("run: " + false);
    }
  }

  @Override
  public void swim(int length) {
    if (length <= 350 && length > 0) {
      System.out.println("run: " + true);
    } else {
      System.out.println("run: " + false);
    }
  }

  @Override
  public void jump(int height) {
    if(height <= 2 && height > 0) {
      System.out.println("jump: " + true);
    } else {
      System.out.println("jump: " + false);
    }
  }
}
