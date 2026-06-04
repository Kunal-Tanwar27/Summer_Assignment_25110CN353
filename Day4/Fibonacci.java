package Day4;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the total number of terms in fibonacci  series");
    int terms = sc.nextInt();

    if (terms <= 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }

    int a = 0, b = 1;
    System.out.println("Fibonacci series:");
    for (int i = 1; i <= terms; i++) {
      System.out.print(a + " ");
      int temp = a + b;
      a = b;
      b = temp;
    }
    sc.close();
  }
}
