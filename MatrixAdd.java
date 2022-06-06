import java.util.Scanner;
class MatrixAdd
{
  public static void main(String arg[])
   {
    int r,c;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of row and column");
	r=in.nextInt();
	c=in.nextInt();
	int matrixA[][]=new int[r][c];
	int matrixB[][]=new int[r][c];
	int sumMatrix[][]=new int[r][c];
	System.out.println("Enter elements of first matrix:");
	 for(int i=0;i<r;i++)
	  {
	    for(int j=0;j<c;j++)
		{
		 matrixA[i][j]=in.nextInt();
		 }
	  }	
	  System.out.println("Enter elements of second matrix:");
	 for(int i=0;i<r;i++)
	  {
	    for(int j=0;j<c;j++)
		{
		 matrixB[i][j]=in.nextInt();
		 }
	  }
	System.out.println("Sum of Matrix");
	 for(int i=0;i<r;i++)
	 {
	  for(int j=0;j<c;j++)
	  {
	   sumMatrix[i][j]=matrixA[i][j]+matrixB[i][j];
	   System.out.print(sumMatrix[i][j]+" ");
	   }
	   System.out.println();
	  }
	 }
}