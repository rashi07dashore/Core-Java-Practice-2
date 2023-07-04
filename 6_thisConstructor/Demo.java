class Demo
{
   public Demo()
   {
       this(10,20);   //call 2 para const
                                // It is first statement in inside the constructor .
       System.out.println("Default Const Called...");
   }
   public Demo(int x)
   {
       System.out.println("Int para Const Called..."+x);
   }
   public Demo(int x,int y)
   {
       this(40);  //call 1 para const
       System.out.println("Int-Int Para Const Called..."+(x+y));
   }  
   public static void main(String args[])
   {
      Demo d1 = new Demo(); //d1 is default object
   }
}

