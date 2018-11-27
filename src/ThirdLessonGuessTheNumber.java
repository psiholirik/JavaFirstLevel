
/**
 * Java. Level 1. Lesson 3 Homework
 *
 * @author Rubtsov Artem
 * @version dated Nov 27 2018
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ThirdLessonGuessTheNumber {
  //счетчик попыток
  static int count = 0;
  //Играем?
  static boolean isRepeatGame = true;

  public static void main(String[] args) {
    while (isRepeatGame()) {
      System.out.println("Компьютер загадал число...");
      game(generateRandomNumber());
      isRepeatGame = false;
      count = 0;
    }
  }

  static int generateRandomNumber() {
    int number;
    Random random = new Random();
    number = random.nextInt(10);
    //for test
    //System.out.println(number);
    return number;
  }

  static boolean compareNumbers(int userNumber, int secretNumber) {
    if (userNumber == secretNumber) {
      System.out.print("Вы угадали, поздравляю! ");
      return true;
    } else if (count == 2) {
      System.out.print("Вы проиграли! ");
      return true;
    } else if (userNumber > secretNumber) {
      System.out.println("Загаданное число меньше!");
      count++;
      return false;
    } else {
      System.out.println("Загаданное число больше!");
      count++;
      return false;
    }
  }

  static void game(int secretNumber) {
    int userNumber = -1;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    while(count < 3) {
      System.out.print("Введите ваше число: ");
      try {
        userNumber = Integer.parseInt(bufferedReader.readLine());
      } catch (IOException e) {
        e.printStackTrace();
      }
      System.out.println();
      if(compareNumbers(userNumber, secretNumber)) {

        break;
      }
    }
  }

  static boolean isRepeatGame() {
    if(isRepeatGame) {
      return true;
    } else {
      int userChoice = 1;
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Повторить игру еще раз? 1 – да / 0 – нет ");
      try {
        userChoice = Integer.parseInt(bufferedReader.readLine());
      } catch (IOException e) {
        e.printStackTrace();
      }
      if(userChoice == 1) {
        return true;
      } else {
        return false;
      }
    }
  }
}
