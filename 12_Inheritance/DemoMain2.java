class A
{
   public A()
   {
      System.out.println("A Class Default Const Called...");   
   }
}
class B extends A
{
   public B()
   {
      System.out.println("B Class Default Const Called...");   
   }
}
class DemoMain2
{
   public static void  main(String args[])
   {
       B obj = new B();
   }
}
