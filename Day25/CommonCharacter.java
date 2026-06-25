package Day25;

import java.util.Scanner;

public class CommonCharacter {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the first string ");
    String str1 = sc.nextLine().trim();
    System.out.println(" enter the second string ");
    String str2 = sc.nextLine().trim();

    String common = "";

    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) == ' ' || common.contains(str1.charAt(i) + " ")) {
        continue;
      }
      for (int j = 0; j < str2.length(); j++) {
        if (str1.charAt(i) == str2.charAt(j)) {
          common = common + str1.charAt(i);
          common = common + " ";
          break;
        }
      }
    }
    System.out.println(" the common characters are: " + common);
    sc.close();
  }

}
