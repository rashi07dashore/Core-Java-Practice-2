class Demo
{
   public void show()
   {
      System.out.println("Show Called....");
   }
   public void show(int x)
   {
      System.out.println("int Show Called...."+x);
   }
   public void show(char x)
   {
      System.out.println("char Show Called...."+x);
   }
   public void show(int x,int y)
   {
    System.out.println("int-int Show Called...."+(x+y));
   }
   public static void main(String args[])
   {
       Demo d = new Demo();
       d.show();
       d.show(10);
       d.show('A');
       d.show(10,20);
   }
}
