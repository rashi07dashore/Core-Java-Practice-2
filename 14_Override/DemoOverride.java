class A
{
   public static void show()
   {
      System.out.println("A Class Show Called....");
   }
}
class B extends A
{
   public void show()
   {
      System.out.println("B Class Show Called....");
   }
}
class DemoOverride
{
   public static void main(String args[])
   {
       B obj1 = new B();
      A obj3 = new B();
   
      obj1.show();
      obj3.show();
   }
}
