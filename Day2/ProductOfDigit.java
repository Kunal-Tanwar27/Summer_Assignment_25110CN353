package Day2;

import java.util.Scanner;

public class ProductOfDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the number");
    int num = sc.nextInt();
    int product = 1;
    while (num > 0) {
      int digits = num % 10;
      product = product * digits;
      num = num / 10;

    }
    System.out.println("the product of digits is:" + product);

    sc.close();

  }
}
