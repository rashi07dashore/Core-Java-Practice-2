import java.util.Scanner;
class MyEmployeeData
{ 
    Employee emp;
    public void setEmployee()
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Employee Id,Name,Salary and Mobile");
       int id = sc.nextInt();
       String name = sc.next();
       float salary = sc.nextFloat();
       String mobile = sc.next();
   
       emp = new Employee(id,name,mobile,salary);
   }
  public void showEmployee()
  {
       System.out.println("Employee Id : "+emp.getEid());
       System.out.println("Employee Name : "+emp.getEname());
       System.out.println("Employee Salary : "+emp.getSalary());
       System.out.println("Employee Mobile : "+emp.getMobile());
  }
}
