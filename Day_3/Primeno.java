package Day3;

import java.util.*;

public class Primeno {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the number");
    int num = sc.nextInt();

    if (num <= 1) {
      System.out.println(num + " is not a prime number");
    }

    else {
      int flag = 0;

      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          flag = 1;
          break;
        }
      }
      if (flag == 0)
        System.out.println(num + " is a prime number");
      else
        System.out.println(num + " is not a prime number");
      sc.close();

    }
    sc.close();
  }
}
