class Demo
{
   public Demo()
   {
       System.out.println("Default Const Called...");
   }
   public Demo(int x)
   {
       System.out.println("Int para Const Called...");
   }
   public Demo(int x,int y)
   {
       System.out.println("Int-Int Para Const Called...");
   }  
   public static void main(String args[])
   {
      Demo d1 = new Demo(); //d1 is default object    
   }
}

