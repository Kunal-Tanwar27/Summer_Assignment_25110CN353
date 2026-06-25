package Day25;

import java.util.Scanner;

public class SortWordByLength {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the number of strings required");
    int size = sc.nextInt();

    String[] arr = new String[size];

    System.out.println("enter the data");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.next();
    }

    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 1; j < arr.length - i; j++) {
        if ((arr[j - 1]).length() > (arr[j]).length()) {
          String temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
    System.out.println("The names in the sorted format are:");
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
