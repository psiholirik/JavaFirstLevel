public class FirstLesson {
  //1
  public static void main(String[] args) {
    //2
    byte testByte = 2;
    short testShort = 456;
    int testInt = 1247;
    long testLong = 1258129L;
    float testFloat = 561.5f;
    double testDouble = 125.1;
    boolean testBoolean = true;
    char testChar = 'C';
    String testString = "Artem";

    //tests
    System.out.println("returnExpressionResult = " + returnExpressionResult(2.2, 5, 6, 7));
    System.out.println("amountCheck (amount > 20) = " + amountCheck(testInt, 5));
    System.out.println("amountCheck (amount < 10) = " + amountCheck(1.421, 1));
    System.out.println("amountCheck (amount = 10) = " + amountCheck(10, 0));
    System.out.println("amountCheck (amount = 20) = " + amountCheck(19,1));
    System.out.println("amountCheck (amount > 10 and amount < 20) = " + amountCheck(12, 5));
    printPositiveOrNegative(0);
    printPositiveOrNegative(2);
    printPositiveOrNegative(-251);
    System.out.println("isNegative (param > 0) = " + isNegative(5));
    System.out.println("isNegative (param < 0) = " + isNegative(-5));
    System.out.println("isNegative (param = 0) = " + isNegative(0));
    printGreeting(testString);
    printIsYearLeapYear(-1);
    printIsYearLeapYear(200);
    printIsYearLeapYear(800);
    printIsYearLeapYear(2016);
    printIsYearLeapYear(2017);
  }
  //3
  static double returnExpressionResult(double a, double b, double c, double d) {
    return a * (b + (c/d));
  }
  //4
  static boolean amountCheck(double a, double b) {
    return a + b >= 10 && a + b <= 20;
  }
  //5
  static void printPositiveOrNegative(int i) {
    if (i >= 0) {
      System.out.println(i + " is positive");
    } else {
      System.out.println(i + " is negative");
    }
  }
  //6
  static boolean isNegative(int i) {
    return i < 0;
  }
  //7
  static void printGreeting(String s) {
    System.out.println("Привет, " + s + "!");
  }
  //8
  static void printIsYearLeapYear(int i) {
    if (i > 0) {
      if (i % 4 == 0) {
        if (i % 100 != 0 || i % 400 == 0) {
          System.out.println(i + " - високосный год");
        } else {
          System.out.println(i + " - невисокосный год");
        }
      } else {
        System.out.println(i + " - невисокосный год");
      }
    } else {
      System.out.println("введен некорректный год");
    }
  }
}
