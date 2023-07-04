class Demo
{
   public void show()
   {
       wish();  //wish Function called...
      System.out.println("Show Called...");
   }
   public static void wish()
   {
     // show();  //error 
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
