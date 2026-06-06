package Day6;

import java.util.Scanner;

public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println(" enter the decimal number ");
    int num = sc.nextInt();

    if (num < 0) {
      System.out.println(" invalid entry");
      sc.close();
      return;
    }
    if (num == 0) {
      System.out.println(" binary number is 0");
      sc.close();
      return;
    }
    int binary = 0;
    int place = 1;
    while (num > 0) {
      int rem = num % 2;
      binary = binary + rem * place;
      place = place * 10;
      num = num / 2;
    }

    System.out.println(" binary number is " + binary);
    sc.close();

  }

}