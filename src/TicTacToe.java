/**
 * Java 1. Lesson 4. Tic-tac-toe in console
 *
 * @author Artem Rubtsov
 * @version dated Dec 02, 2018
 */

import java.util.Random;
import java.util.Scanner;

class TicTacToe {

  final char DOT_X = 'x';
  final char DOT_O = 'o';
  final char DOT_EMPTY = '.';
  int dotToWin;
  int fieldSize;
  char[][] map;
  Scanner sc = new Scanner(System.in);
  Random rand = new Random();

  public static void main(String[] args) {
    new TicTacToe().game();
  }

  void game() {
    initMap();
    while (true) {
      humanTurn();
      if (checkWin(DOT_X)) {
        System.out.println("YOU WON!");
        break;
      }
      if (isMapFull()) {
        System.out.println("Sorry, DRAW!");
        break;
      }
      aiTurn();
      printMap();
      if (checkWin(DOT_O)) {
        System.out.println("AI WON!");
        break;
      }
      if (isMapFull()) {
        System.out.println("Sorry, DRAW!");
        break;
      }
    }
    System.out.println("GAME OVER.");
    printMap();
  }

  void initMap() {
    setFieldSizeAndRules();
    map = new char[fieldSize][fieldSize];
    for (int i = 0; i < fieldSize; i++)
      for (int j = 0; j < fieldSize; j++)
        map[i][j] = DOT_EMPTY;
  }

  void printMap() {
    for (int i = 0; i < fieldSize; i++) {
      for (int j = 0; j < fieldSize; j++)
        System.out.print(map[i][j] + " ");
      System.out.println();
    }
    System.out.println();
  }

  void humanTurn() {
    int x, y;
    do {
      System.out.println("Enter X and Y (1.." + fieldSize + "):");
      x = sc.nextInt() - 1;
      y = sc.nextInt() - 1;
    } while (!isCellValid(x, y));
    map[y][x] = DOT_X;
  }

  void aiTurn() {
    int x, y;
    do {
      x = rand.nextInt(fieldSize);
      y = rand.nextInt(fieldSize);
    } while (!isCellValid(x, y));
    map[y][x] = DOT_O;
  }

  boolean checkWin(char dot) {
    int countDots = 0;
    //check horizontal
    for (char[] aMap : map) {
      for (int j = 0; j < map.length; j++) {
        if (aMap[j] == dot) {
          countDots++;
          if (countDots >= dotToWin) {
            return true;
          }
        } else {
          countDots = 0;
        }
      }
      countDots = 0;
    }
    //check vertical
    for (int i = 0; i < map.length; i++) {
      for (char[] aMap : map) {
        if (aMap[i] == dot) {
          countDots++;
          if (countDots >= dotToWin) {
            return true;
          }
        } else {
          countDots = 0;
        }
      }
      countDots = 0;
    }
    //check first diagonal
    for (int i = 0; i < map.length; ++i) {
      if (map[i][i] == dot) {
        countDots++;
        if (countDots >= dotToWin) {
          return true;
        }
      } else {
        countDots = 0;
      }
    }
    //check second diagonal
    for (int i = 0; i < map.length; ++i) {
      if (map[fieldSize - i - 1][i] == dot) {
        countDots++;
        if (countDots >= dotToWin) {
          return true;
        }
      } else {
        countDots = 0;
      }
    }
    return false;
  }

  boolean isMapFull() {
    for (int i = 0; i < fieldSize; i++)
      for (int j = 0; j < fieldSize; j++)
        if (map[i][j] == DOT_EMPTY)
          return false;
    return true;
  }

  boolean isCellValid(int x, int y) {
    if (x < 0 || y < 0 || x >= fieldSize || y >= fieldSize)
      return false;
    return map[y][x] == DOT_EMPTY;
  }

  void setFieldSizeAndRules() {
    System.out.print("Input field size: ");
    fieldSize = sc.nextInt();
    System.out.print("Input dot count to win: ");
    while (true) {
      if (dotToWin == 0 || dotToWin > fieldSize) {
        dotToWin = sc.nextInt();
      } else {
        break;
      }
    }
  }
}