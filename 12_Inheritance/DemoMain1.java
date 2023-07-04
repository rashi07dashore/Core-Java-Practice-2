class A
{
    int x = 10;
    static int y = 20;
    final int Z = 30;  //constant variable
}
class B extends A
{
   public void show()
   {
       System.out.println("Value of x is : "+x);
       System.out.println("Value of x is : "+y);
       System.out.println("Value of Z is : "+Z);
   }
}
class DemoMain1
{
   public static void main(String args[])
   {
       B obj = new B();  //Child class object and child refernce 
       obj.show();
   }
}
