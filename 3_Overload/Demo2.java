class Demo
{
   public static void main(String args[])
   {
     System.out.println("String type method called..");
      main(10);
   }
   public static void main(int x)
   {
      main('A');
     System.out.println("int type method called..");
   }  
   public static void main(char ch)
   {
     System.out.println("char type method called..");
   }
}
