import java.util.Scanner;
class Demo
{
   public static void main(String args[])
   { 
      int i,temp,j;
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
      //Asscending 
      for(i=0;i<size;i++)
      {
         for(j=i+1;j<size;j++)
         {
           if(arr[i]>arr[j])
           {
              temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
           }
         }
      }
      System.out.println("\nReverse Array Element is : ");
      for(int ar : arr)
      {
         System.out.print(ar+"\t");
      }
       System.out.println(); 
   }
}
