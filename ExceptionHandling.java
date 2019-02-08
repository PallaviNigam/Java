class ExceptionTest {

	
	
 public int calculate  (int a, int b) throws Exception 
 {
	return (a/b);
 }
 public int calculatedevisionbyten(int a, int b)
 {
	 try
	 {
	return( this.calculate(a, (b-10)));
	 }
	 catch( Exception e)
	 
	 {
	 System.out.println("Exception " + 	 e +"is raised while calculating devision by 10");
	 return 0;
	 }
   
 }
 public int calculatedevision(int a, int b)
 {
	 try
	 {
	return( this.calculate(a, b));
	 }
	 catch( Exception e)
	 
	 {
	 System.out.println("Exception " + 	 e +"is raised while calculating devision");
	 return 0;
	 }
 }
}



public class HelloWorld extends ExceptionTest
{
public static void main(String[] agrgs)
{
	
	ExceptionTest obj = new ExceptionTest();
	System.out.println(obj.calculatedevision(10, 10));
	System.out.println(obj.calculatedevision(10, 0));
	System.out.println(obj.calculatedevisionbyten(10, 20));
	System.out.println(obj.calculatedevisionbyten(10, 10));
}

}
