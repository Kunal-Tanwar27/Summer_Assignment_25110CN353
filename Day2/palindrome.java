package Day2;

import java.util.Scanner;

public class palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the number");
    int num = sc.nextInt();
    int n = num;
    int reverse = 0;

    while (num > 0) {
      int digit = num % 10;
      reverse = reverse * 10 + digit;
      num = num / 10;
    }

    if (n == reverse) {
      System.out.println("The number is a palindrome");
    } else {
      System.out.println("The number is not a palindrome");
    }

    sc.close();
  }
}
