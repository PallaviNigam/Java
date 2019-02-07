//Factorial no program using recursion 
import java.io.*;
class Factorial
{
    public int calculateFactorial(int i)
    {
        if (i==1)
        {
            return 1;
        }
        else
        {
            return (i* calculateFactorial(i-1));
        }
    }
}
public class Test
{
    public static void main(String[] args) throws IOException
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int i = Integer.parseInt(br.readLine());
      Factorial fact = new Factorial();
      int cal = fact.calculateFactorial(i);
      System.out.println(cal);
       
    }
}
