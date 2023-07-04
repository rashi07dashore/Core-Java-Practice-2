class Demo
{
   static int x = 10;
   int y = 30;
   public void getData()
   {
       x++;
       y++;
   }
   public void showData()
   {
     System.out.println("x is "+x+" \t y is : "+y);
   }
   public static void main(String args[])
   {
      Demo d1 = new Demo();
      Demo d2 = new Demo();
      Demo d3 = new Demo();
      Demo d4 = new Demo();
      Demo d5 = new Demo();
           
   
     d1.getData();
     d2.getData();
     d3.getData();
     d4.getData();
     d5.getData();
    
      d1.showData();
      d2.showData();
      d3.showData();
      d4.showData();
      d5.showData();
    }
}
