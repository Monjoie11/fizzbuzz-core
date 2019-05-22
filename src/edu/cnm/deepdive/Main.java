package edu.cnm.deepdive;

/**
 * This class contains the method which will define the range of integers used by {@link FizzBuzz}
 *
 * @author Jeff Franken &amp; the Deep Dive 7
 * @version 1.0.0
 */
public class Main {

  private Main(){}
  /**
   * The main method that passes a series of integers of a defined range to FizzBuzz
   * @param args i, a variable between 1 and 100, as presently defined
   */
  public static void main(String[] args) {
    for(int i = 1; i <= 100; i++){
      System.out.println(FizzBuzz.fizzBuzzValue(i));
    }
  }
}
