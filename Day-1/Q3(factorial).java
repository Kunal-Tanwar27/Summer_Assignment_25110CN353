
import java.util.Scanner;
public class Factorial
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter the number whose factorial is to be printed");
    int num = sc.nextInt();
     if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
        else 
        {
            
int fact = 1;
        
       for(int i = 1; i<=num; i++)
    {
      fact = fact*i;
    }
    System.out.println(" the  result =" + fact);
  }

    sc.close();
  }
}
