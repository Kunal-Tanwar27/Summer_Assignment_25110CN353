package Day3;

import java.util.*;

public class Printprime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the first number");
    int num1 = sc.nextInt();
    System.out.println(" enter the second number");
    int num2 = sc.nextInt();
    if (num1 <= num2) {
      for (int i = num1; i <= num2; i++) {

        boolean prime = true;

        if (i <= 1) {
          continue;
        }

        for (int j = 2; j <= Math.sqrt(i); j++) {
          if (i % j == 0) {
            prime = false;
            break;
          }
        }
        if (prime) {
          System.out.println(i);
        }
      }
    }

    else
      System.out.println(" invalid range");

    sc.close();

  }
}
