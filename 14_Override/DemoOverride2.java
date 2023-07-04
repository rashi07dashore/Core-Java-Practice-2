class A
{
   public final void show()
   {
      System.out.println("A Class Show Called....");
   }
}
class B extends A
{
   public final void show()
   {
      System.out.println("B Class Show Called....");
   }
}
class DemoOverride2
{
   public static void main(String args[])
   {
       B obj1 = new B();
       A obj3 = new B();
   
       obj1.show();
       obj3.show();
   }
}
/*
  Error : We cannot overrid a final method
*/
