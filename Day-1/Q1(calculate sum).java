import java.util.Scanner;
public class CalculateSum
{
  public static void main(Strings[] args)
  {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number");
  int num = sc.nextInt();
   int sum = 0;


   for(int i = 0; i<=num; i++)
   {
    sum = sum+i;
   }
   System.out.println(" The total sum of natural number is :" + sum);

   sc.close();
  }

}