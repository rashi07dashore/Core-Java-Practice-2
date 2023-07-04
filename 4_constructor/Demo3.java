import java.util.Scanner;
class Demo
{
   int x,y;  //Instance variable
   public Demo(int x,int y)
   {
      this.x = x;
      this.y = y;
   }
   public void showData()
   {
       System.out.println("Value of x is : "+x);
       System.out.println("Value of y is : "+y);
   }
   public static void main(String args[])
   {
        int x,y;   //local variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y ");
        x = sc.nextInt();
        y = sc.nextInt();
        
        Demo d = new Demo(x,y);
        d.showData();
        
      /*error : d1 is a default object then co9ntroller search deafult construtor in a class
        Demo d1 = new Demo();
   */     
   }
}

