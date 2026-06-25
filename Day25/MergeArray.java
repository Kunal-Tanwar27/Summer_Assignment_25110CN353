package Day25;

import java.util.Scanner;

public class MergeArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the size of the first array");
    int size1 = sc.nextInt();
    System.out.println(" enter the size of the second array");
    int size2 = sc.nextInt();

    int[] arr1 = new int[size1];
    int[] arr2 = new int[size2];

    System.out.println("enter the element of the first array");
    for (int i = 0; i < size1; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.println("enter the element of the second array");
    for (int i = 0; i < size2; i++) {
      arr2[i] = sc.nextInt();
    }
    int size3 = size1 + size2;
    int[] merge = new int[size1 + size2];

    // merging two arrays

    for (int i = 0; i < (size1 + size2); i++) {
      if (i < size1) {
        merge[i] = arr1[i];
      } else {
        merge[i] = arr2[i - size1];
      }
    }

    // sorting element present in merge array

    for (int i = 0; i < size3 - 1; i++) {
      for (int j = 1; j < size3 - i; j++) {
        if (merge[j] < merge[j - 1]) {
          int temp = merge[j];
          merge[j] = merge[j - 1];
          merge[j - 1] = temp;
        }

      }
    }

    System.out.println(" the merged array is");
    for (int i = 0; i < size3; i++) {
      System.out.print(merge[i] + " ");
    }

    sc.close();
  }
}
