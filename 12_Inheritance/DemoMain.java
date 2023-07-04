class A
{
   public void show()
   {
      System.out.println("Show Called....");
   }
   public static void display()
   {
       System.out.println("Display Called....");
   }
   public final void demo()
   {
       System.out.println("Demo Called....");
   }
}
class B extends A
{
   public void wish()
   {
       System.out.println("Wish Called....");
   }
}
class DemoMain
{
   public static void main(String args[])
   {
       B obj = new B();  //Child class object and child refernce 
       obj.show();
       obj.wish();
       obj.display();
       obj.demo();
   }
}
