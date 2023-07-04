import java.util.Scanner;
class Employee
{
   int eid;
   String ename,mobile;
   float salary;
   
   Employee()
   {
   
   }
   Employee(int eid,String ename,String mobile,float salary)
   {
      this.eid = eid;
      this.ename = ename;
      this.mobile = mobile;
      this.salary = salary;
   }
   public void getEmployee()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Employee Id,Name,Salary and Mobile");
       eid = sc.nextInt();
       ename = sc.next();
       salary = sc.nextFloat();
       mobile = sc.next();
   }
  public void showEmployee()
  {
       System.out.println("Employee Id : "+eid);
       System.out.println("Employee Name : "+ename);
       System.out.println("Employee Salary : "+salary);
       System.out.println("Employee Mobile : "+mobile);
  }
}
