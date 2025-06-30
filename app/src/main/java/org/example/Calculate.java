package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int sumSequence(int x, int y) {
    int count = 0;
    for (int i = x; i <= y; i++) {
      count += i;
    }
    return count;
  }

  public int sumOdd(int x, int y) {
    int count = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        count += i;
      }
    }
    return count;
  }

  public int sumEven(int x, int y) {
    int count = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1) {
        count += i;
      }
    }
    return count;
  }

}
