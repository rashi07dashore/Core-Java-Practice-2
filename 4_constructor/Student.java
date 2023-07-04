import java.util.Scanner;
class Student
{
   int rno;
   float fees;
   String name;
   public Student()
   {
        rno = 100;
        fees = 123.34f;
        name = "Mahi";
   }
   public void getStudent()
   {
      System.out.println("Enter Student Roll No,name and fees");
      Scanner sc = new Scanner(System.in);
      rno = sc.nextInt();
      name = sc.next();
      fees = sc.nextFloat();
   }
   public void showStudent()
   {
      System.out.println("Roll No is : "+rno);
      System.out.println("Name is : "+name);
      System.out.println("Fees is : "+fees);
   }
   public static void main(String args[])
   {
       Student std = new Student();  //d is object    
       std.showStudent();
       std.getStudent();
       std.showStudent(); 
   }
}

