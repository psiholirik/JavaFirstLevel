import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

/**
 * Java. Level 1. Lesson 3 Homework
 *
 * @author Rubtsov Artem
 * @version dated Nov 28 2018
 */

public class ThirdLessonGuessTheWord {
  static String[] array = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
          "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
          "pepper", "pineapple", "pumpkin", "potato"};

  public static void main(String[] args) {
    game();
  }

  static String getRandomWord() {
    String secretWord;
    int element;

    Random random = new Random();
    element = random.nextInt(25);

    secretWord = array[element];
    //for test
    System.out.println(secretWord);

    return secretWord;
  }

  static boolean compareWords(String secretWord, String userWord) {
    char[] array = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
    int min = returnMin(secretWord, userWord);
    int count = 0;

    for (int i = 0; i < min; i++) {
      if (secretWord.charAt(i) == userWord.charAt(i)) {
        array[i] = userWord.charAt(i);
        count++;
      }
    }
    if(count == secretWord.length() && secretWord.length() == userWord.length()) {
      System.out.println("Вы угадали слово!");
      return true;
    } else {
      System.out.println(Arrays.toString(array));
      return false;
    }
  }

  static void game() {
    String secretWord = getRandomWord();
    //пользователь угадал слово. Конец игры
    boolean endGame = false;
    String userWord = null;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    while (!endGame) {
      try {
        userWord = bufferedReader.readLine().toLowerCase();
      } catch (IOException e) {
        e.printStackTrace();
      }
      endGame = compareWords(secretWord, userWord);
    }
  }

  static int returnMin(String secretWord, String userWord) {
    int min;
    if(secretWord.length() > userWord.length()) {
      min = userWord.length();
    } else {
      min = secretWord.length();
    }
    return min;
  }
}
