class A
{
    public A()
    {
       System.out.println("A Class Default Const Called..");
    }
    public A(int x)
    {
       System.out.println("A Class Para Const Called.."+x);
    }
}
class B extends A
{
   public B(int x)
   {
      super(x);  //super(50) : call parent class para const
      System.out.println("B Class Para Const Called..."+x);
   //   super(x); //error  : super always first statement in constructor
   }
}
class DemoSuperConstructor
{
   public static void main(String args[])
   {
      B obj = new B(10);
   }
}
