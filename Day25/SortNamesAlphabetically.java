package Day25;

import java.util.Scanner;

public class SortNamesAlphabetically {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the number of a names required");
    int size = sc.nextInt();

    String[] arr = new String[size];

    System.out.println("enter the names in the array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.next();
    }

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j - 1].compareToIgnoreCase(arr[j]) >= 0) {
          String temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }

    System.out.println("The names in alphabetical order are:");
    for (int i = 0; i < size; i++) {
      System.out.print(arr[i] + " ");
    }
    /*
     * program is done by the coder itself and verified..
     * regards,
     * KUNAL TANWAR
     * [CODER]
     */
    sc.close();
  }

}
