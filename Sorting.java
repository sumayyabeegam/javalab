import java.util.Scanner;
public class Sorting
{
 public static void main(String arg[])
  {
    int c;
	String temp;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number of strings:");
	c=scan.nextInt();
	String str[]=new String[c];
	Scanner scan2=new Scanner(System.in);
	System.out.println("Enter strings:");
	for(int i=0;i<c;i++)
	 {
	   str[i]=scan2.nextLine();
	   }
	for(int i=0;i<c;i++)
	 {
	   for(int j=i+1;j<c;j++)
	    {
		 if(str[i].compareTo(str[j])>0)                                                                                                                                                       
		  {
		   temp=str[i];
		   str[i]=str[j];
		   str[j]=temp;
		   }
		 }
	 }
	 System.out.print("Sorted string");
	 for(int i=0;i<=c-1;i++)
	  {
	   System.out.println(str[i]);
	   }
	  }
	 }
    