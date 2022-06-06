class Cpu
{
 int price;
 void display(int p)
  {
    price=p;
   System.out.println("Price:"+price);
   }
   
 class Processor
 {
  int core;
  String manufacturer;
  void print(int c,String m)
  {
   core=c;
   manufacturer=m;
   System.out.println("No.of core:"+core);
   System.out.println("Manufacturer:"+manufacturer);
   }
  }
 }
 class MainCpu
 {
  public static void main(String arg[])
   {
     Cpu cp=new Cpu();
	 cp.display(Integer.parseInt(arg[0]));
	 Cpu.Processor pr=cp.new Processor();
	 pr.print(Integer.parseInt(arg[1]),arg[2]);
	 }
	}
                                                                                                                                                                                                                                                                