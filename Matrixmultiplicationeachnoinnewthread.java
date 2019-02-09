package first;
class Matrix 
{
	int mat1[][] = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
		};
	int mat2[][] = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9},
		};
	
	int[][] mat3 = new int[3][3]; // = new mat3[3][3];
	/*public  Matrix()
	{
		 mat3 =  new int[3][3];  
	}*/

	public void cal(int i, int j)
	{
		int sum = 0;
		for(int k = 0; k<3;k++)
		{
			
			sum = sum + mat1[i][k]*mat2[k][j];
		}
		
		mat3[i][j] = sum;
	}
	
	}

public class HelloWorld{
	public static void main(String[] args) throws Exception 
	{
		Matrix mt = new Matrix();
		Thread th1 = new Thread(new Runnable()
				{
			public void run()
			{
			mt.cal(0,0);
			}
				});
	
	
	th1.start();
	Thread th2 = new Thread(new Runnable()
	{
public void run()
{
mt.cal(0,1);
}
	});
	th2.start();
	Thread th3 = new Thread(new Runnable()
	{
public void run()
{
mt.cal(0,2);
}
	});
	th3.start();
	th1.join();
	th2.join();
	th3.join();
System.out.println(mt.mat3[0][0]);
System.out.println(mt.mat3[0][1]);
System.out.println(mt.mat3[0][2]);
}}
