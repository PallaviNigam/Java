package first;

class Thread1 extends Thread
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


class Thread2 extends Thread
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
Thread th1 = new Thread1();
th1.start();
Thread th2 = new Thread2();
th2.start();
}
}
