import java.util.Scanner;
class Demo
{
   public static void main(String args[])
   { 
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of rows and cols");
       int row = sc.nextInt();
       int col = sc.nextInt();
       int arr[][] = new int[row][col];
       
       System.out.println("Enter Array Elements : ");
       for(int i=0;i<arr.length;i++)
       {
          for(int j=0;j<arr[i].length;j++)
          {
               arr[i][j] = sc.nextInt();
          }
       }
       
       System.out.println("Array Elements : ");
       for(int ar[] : arr)
       {
          for(int a : ar)
          {
             System.out.print(a+"\t");
          }
          System.out.println();
       }
       
        System.out.println();
  }
}
