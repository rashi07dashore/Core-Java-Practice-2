class A
{
   public A()
   {
      System.out.println("A Class default Const Called...");   
   }
}
class B extends A
{
   public B(int x)
   {
      System.out.println("B Class Para Const Called..."+x);   
   }
}
class DemoMain3
{
   public static void  main(String args[])
   {
       B obj = new B(10);
   }
}
