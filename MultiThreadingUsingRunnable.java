package first;

class Thread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Hii");
		try {
		Thread.sleep(500);
		}catch(Exception e)
		{
			
		}
		}
	}
}


class Thread2 implements  Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Hello");
		try {
			Thread.sleep(500);
			}catch(Exception e)
			{
				
			}
		}
		
	}
}

//import javax.xml.crypto.dsig.spec.HMACParameterSpec;
public class HelloWorld extends ExceptionTest
{
public static void main(String[] agrgs)
{
Runnable th1 = new Thread1();
Thread th11 = new Thread(th1);
th11.start();
Runnable th2 = new Thread2();
Thread th22 = new Thread(th2);
th22.start();
}
}
