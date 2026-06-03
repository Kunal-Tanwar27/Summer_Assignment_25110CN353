package Day3;

import java.util.Scanner;

public class FindLCM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the first number");
    int num1 = sc.nextInt();
    System.out.println(" enter the second number");
    int num2 = sc.nextInt();

    num1 = Math.abs(num1);
    num2 = Math.abs(num2);

    if (num1 == 0 || num2 == 0) {
      System.out.println("LCM = 0");
      sc.close();
      return;
    }

    int lcm = (num1 < num2) ? num2 : num1;

    for (int i = lcm;; i++) {
      if (i % num1 == 0 && i % num2 == 0) {
        lcm = i;
        break;
      }
    }

    System.out.println("The LCM of the two numbers is: " + lcm);
    sc.close();
  }
}
