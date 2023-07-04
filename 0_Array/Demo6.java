import java.util.Scanner;
class Demo
{
   public static void main(String args[])
   {
      int arr[][] = new int[3][]; 
      System.out.println("arr length : "+arr.length);
      
      arr[0] = new int[4];
      arr[1] = new int[6];
      arr[2] = new int[2];
  
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Array Elements : ");
      for(int i=0;i<arr.length;i++)
      {
         for(int j=0;j<arr[i].length;j++)
         {
             arr[i][j] = sc.nextInt();
         }
      }
      System.out.println("Array Element is : ");
      for(int ar[] : arr)
      {
         for(int a : ar)
         {
            System.out.print(a+"\t");
         }
         System.out.println();
      }
      
  }
}
