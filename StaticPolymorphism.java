public class HelloWorld{

     public static void main(String []args){
         Shape obj = new Shape();
         
        System.out.println( obj.cal_area(2,3));
        System.out.println( obj.cal_area(2));
     }
}

class Shape
{
  //calculates area of rectangle
    public int cal_area( int a, int b)
    {
        return (a*b);
    }
    
    //Calculates area of sqaure
    public int cal_area(int a)
    {
        return (a*a);
    }
}
