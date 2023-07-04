import java.util.Scanner;
class Demo
{
   public static void main(String args[])
   { 
      int i;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Array Size");
      int size = sc.nextInt();
      int arr[] = new int [size];
      System.out.println("Enter Array Elements");
      for(i=0;i<size;i++)
      {
         arr[i] = sc.nextInt();
      }
      System.out.println("Array Element is : ");
      for(int ar : arr)
      {
         System.out.print(ar+"\t");
      }
      //reverse 
      for(i=0;i<size/2;i++)
      {
          int temp = arr[i];
          arr[i] = arr[(size-i)-1];
          arr[(size-i)-1] = temp;
      }
      System.out.println("\nReverse Array Element is : ");
      for(int ar : arr)
      {
         System.out.print(ar+"\t");
      }
   }
}
