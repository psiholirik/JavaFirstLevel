public class Chihua implements Dog {
  public void run(int length) {
    if (length <= 20 && length > 0) {
      System.out.println("run: " + true);
    } else {
      System.out.println("run: " + false);
    }
  }

  @Override
  public void swim(int length) {
    if (length <= 2 && length > 0) {
      System.out.println("run: " + true);
    } else {
      System.out.println("run: " + false);
    }
  }

  @Override
  public void jump(int height) {
    if(height <= 1 && height > 0) {
      System.out.println("jump: " + true);
    } else {
      System.out.println("jump: " + false);
    }
  }
}
