class Area
{
 void area(int a)
  {
    int ar=a*a;
	System.out.println("Area of square:"+ar);
	}
  void area(int a,int b)
   {
     int ar1=a*b;
	 System.out.println("Area of rectangle:"+ar1);
	}
   }
  class Overload
   {
    public static void main(String arg[])
	{
	 Area ob=new Area();
	 ob.area(2);
	 ob.area(2,4);
	 }
	}