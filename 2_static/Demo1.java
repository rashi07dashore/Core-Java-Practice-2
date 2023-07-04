class Demo
{
   public void show()
   {
      System.out.println("Show Called...");
   }
   public static void wish()
   {
      System.out.println("Wish Called...");
   }

   public static void main(String args[])
   {
       Demo d = new Demo();
         d.show();
         d.wish();
         Demo.wish();  //static member   
   
    }
}
