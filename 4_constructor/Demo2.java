class Demo
{
   public Demo(int x)
   {
      System.out.println("Para Const Called..."+x);
   }
   public static void main(String args[])
   {
      // Demo d = new Demo(20);  //d is a parameterized object    
 
       int num = 20;
       Demo d = new Demo(num); 
   }
}

