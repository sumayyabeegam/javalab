import java.util.Scanner;
interface A{
void area();
void perimeter();
}
class Circle implements A
{
	Scanner sc=new Scanner(System.in);
 double a,p;
 public void area()
 {
  System.out.println("Enter radius of circle:");
 int r=Integer.parseInt(sc.nextLine());
  a=3.14*r*r;
  System.out.println("Area of circle:"+a);
  }
 public void perimeter()
  {
	System.out.println("Enter radius of circle:");
    int r=Integer.parseInt(sc.nextLine());  
    p=2*3.14*r;
	System.out.println("Perimeter of circle:"+p);
	}
 }
class Rectangle implements A
{
	Scanner sc=new Scanner(System.in);
 double a,p;         
 public void area()
 {
   System.out.println("Enter length and breadth:");
    int l=Integer.parseInt(sc.nextLine());
   int b=Integer.parseInt(sc.nextLine());
   a=l*b;
   System.out.println("Area of rectangle:"+a);
   }
 public void perimeter()
  {
   System.out.println("Enter length and breadth:");
   int l=Integer.parseInt(sc.nextLine());
   int b=Integer.parseInt(sc.nextLine());
   p=2*(l+b);
   System.out.println("Perimeter of rectangle:"+p);
   }
  }
  class Interfacedemo
   {
     public static void main(String arg[])
	 {
	   Scanner sc=new Scanner(System.in);
	   Rectangle re=new Rectangle();
	   Circle c=new Circle();
	   int c1,ch,l,b,r;
	   do
	   {
		  System.out.println("1.Area of circle \n2.Perimeter of circle \n3.Area of rectangle \n4.Perimeter of rectangle \n5.Exit");
		  System.out.println("Enter your choice:");
		  c1=Integer.parseInt(sc.nextLine());
		  switch(c1)
		  {
			  case 1: c.area();
            		  break;
              case 2: 
                      c.perimeter();
                      break;
              case 3:
					 re.area();
					 break;
			  case 4:
					 re.perimeter();
					 break;
			  case 5:break;
			  default:System.out.println("Invalid choice");
			          break;
		  }
		  System.out.println("Do you want to continue 1 for yes 0 for no:");
		  ch=Integer.parseInt(sc.nextLine());
	   }while(ch!=0);
	 }
   }