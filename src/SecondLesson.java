/**
 * Java. Level 1. Lesson 2 Homework
 *
 * @author Rubtsov Artem
 * @version dated Nov 24 2018
 */
import java.util.Arrays;

public class SecondLesson {
  public static void main(String[] args) {
    int[][] firstArray = new int[11][11];
    int[][] secondArray = new int[10][10];
    int[] thirdArray = {10, 0, -512, 792, 0, -1};
    int[] fourthArray = {1};
    int[] fifthArray = {10, 5, 1, 4, 5, 14, 1};
    int[] sixthArray = {10, 5, 1, 4, 5, 14, 1, 10, 5, 1, 4, 5, 14, 1};

    //first task test
    System.out.println("first task test");
    System.out.println(Arrays.toString(invertArray()) + "\n");

    //second task test
    System.out.println("second task test");
    System.out.println(Arrays.toString(fillArray()) + "\n");

    //third task test
    System.out.println("third task test");
    System.out.println(Arrays.toString(changeArray()) + "\n");

    //fourth task test
    System.out.println("fourth task test");
    printTwoDimensionalArray(fillDiagonal(firstArray));
    printTwoDimensionalArray(fillDiagonal(secondArray));

    //fifth task test
    System.out.println("fifth task test");
    findMinMaxElements(thirdArray);

    //sixth task test
    System.out.println("sixth task test");
    System.out.println("the sum of the left and right sides are equal? " + checkBalance(thirdArray) + "\n");
    System.out.println("the sum of the left and right sides are equal? " + checkBalance(fourthArray) + "\n");
    System.out.println("the sum of the left and right sides are equal? " + checkBalance(fifthArray) + "\n");

    //seventh task test
    System.out.println("seventh task test");
    System.out.println(Arrays.toString(shift(fifthArray, 2)) + "\n");
    System.out.println(Arrays.toString(shift(sixthArray, 0)) + "\n");
    System.out.println(Arrays.toString(shift(sixthArray, -3)) + "\n");


  }
  //1
  static int[] invertArray() {
    int[] array = {1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0};
    for (int i = 0; i < array.length; i++) {
      if (array[i] == 0) {
        array[i] = 1;
      } else {
        array[i] = 0;
      }
    }
    return array;
  }

  //2
  static int[] fillArray() {
    int[] array = new int[8];
    for (int i = 1; i < array.length; i++) {
        array[i] = array[i-1] + 3;
    }
    return array;
  }

  //3
  static int[] changeArray() {
    int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    for (int i = 0; i < array.length; i++) {
      if (array[i] < 6) {
        array[i] = array[i] * 2;
      }
    }
    return array;
  }

  //4
  static int[][] fillDiagonal(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if(i == j) {
          array[i][j] = 1;
        }
        if (array.length - i - 1 == j) {
          array[i][j] = 1;
        }
      }
    }
    return array;
  }

  //print two-dimensional array
  static void printTwoDimensionalArray(int[][] array) {
    for (int[] anArray : array) {
      for (int j = 0; j < array.length; j++) {
        System.out.print(anArray[j] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }

  //5
  static void findMinMaxElements(int[] array) {
    int min = array[0];
    int max = array[0];

    for (int anArray : array) {
      if (anArray < min) {
        min = anArray;
      }
      if (anArray > max) {
        max = anArray;
      }
    }
    //for test
    System.out.println("min element = " + min);
    System.out.println("max element = " + max + "\n");
  }

  //6
  static boolean checkBalance(int[] array) {
    if (array.length < 2) {
      return false;
    }
    int sum1 = 0, sum2 = 0;
    //rounding up
    int secondPartStartPoint = (int) Math.round((double) array.length/2);

    for (int i = 0; i < secondPartStartPoint; i++) {
      sum1 += array[i];
    }
    for (; secondPartStartPoint < array.length; secondPartStartPoint++) {
      sum2 += array[secondPartStartPoint];
    }
    return sum1 == sum2;
  }

  //7
  static int[] shift(int[] array, int shift) {
    if (shift == 0) {
      return array;
    }
    if (shift < 0) {
      return shiftLeft(array, shift);
    } else {
      return shiftRight(array, shift);
    }
  }

  // shift left
  static int[] shiftLeft(int[] array, int shift) {
    int temp;
    shift = Math.abs(shift);
    for (int i = 0; i < shift; i++) {
      temp = array[0];
      for (int j = 0; j < array.length - 1; j++) {
        array[j] = array[j+1];
      }
      array[array.length-1] = temp;
    }
    return array;
  }

  //shift right
  static int[] shiftRight(int[] array, int shift) {
    int temp;

    for (int i = 0; i < shift; i++) {
      temp = array[array.length - 1];

      for (int j = array.length - 1; j > 0; j--) {
        array[j] = array[j - 1];
      }
      array[0] = temp;
    }
    return array;
  }
}