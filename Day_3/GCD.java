package Day3;

import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the first number");
    int num1 = sc.nextInt();
    System.out.println(" enter the second number");
    int num2 = sc.nextInt();

    num1 = Math.abs(num1);
    num2 = Math.abs(num2);

    int n = 1;

    for (int i = 1; i <= num1 && i <= num2; i++) {
      if (num1 % i == 0 && num2 % i == 0) {
        n = i;
      }
    }
    System.out.println("The Greatest common divisor is: " + n);
    sc.close();
  }
}
