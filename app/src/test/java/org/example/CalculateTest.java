package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage_TwoAndSeven_ReturnFour_ten_Five() {
    Calculate calculate = new Calculate();
    double expected = 4.5;
    assertEquals(expected, calculate.average(2, 7), 0.0001);
  }

  @Test
  public void testSumSequence_TwoAndTwelve_ReturnSeventySeven() {
    Calculate calculate = new Calculate();
    int expected = 77;
    assertEquals(expected, calculate.sumSequence(2, 12));
  }

  @Test
  public void testSumOdd_ThreeAndNine_ReturnEighteen() {
    Calculate calculate = new Calculate();
    int expected = 18;
    assertEquals(expected, calculate.sumOdd(3, 9));
  }

  @Test
  public void testSumEven_FourAndTen_ReturnTwentyOne() {
    Calculate calculate = new Calculate();
    int expected = 21;
    assertEquals(expected, calculate.sumEven(4, 10));
  }

}
