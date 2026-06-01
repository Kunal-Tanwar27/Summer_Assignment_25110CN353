
import java.util.Scanner;
public class MultiplicationTable
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the number whose table is to be printed");
    int num = sc.nextInt();
    
    System.out.println(" the table is:");

    for(int i = 1; i <= 10; i++)
    {
      int product = 1;
      product = num*i;
      System.out.println( num + "*" + i + "=" + product);
    }

  sc.close();

  }
}