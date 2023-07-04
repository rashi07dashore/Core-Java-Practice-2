class A
{
   int x = 10;
   int y = 20;
}
class B extends A
{
    int x = 100;
    int y = 200;
    public void show()
    {
        System.out.println("super x is : "+super.x);
        System.out.println("super y is : "+super.y);
       System.out.println("x is : "+x);
        System.out.println("y is : "+y);
    }
}
class DemoSuperVariable
{
   public static void main(String args[])
   {
      B obj = new B();
      obj.show();
   }
}
