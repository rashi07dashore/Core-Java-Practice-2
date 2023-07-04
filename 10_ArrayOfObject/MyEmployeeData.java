import java.util.Scanner;
class MyEmployeeData
{ 
    Employee emp[];
    int i;
    public void setEmployee()
   {
       Scanner sc = new Scanner(System.in);
       emp = new Employee[5];
       int id;
       String name,mobile;
       float salary;
       for(i=0;i<emp.length;i++)
       {
           System.out.println("Enter Employee Id,Name,Salary and Mobile");
           id = sc.nextInt();
           name = sc.next();
           salary = sc.nextFloat();
           mobile = sc.next();
           emp[i] = new Employee(id,name,mobile,salary);
       }
   }
  public void showEmployee()
  {
      System.out.println("Id : Name : Salary : Mobile");
      for(Employee e : emp)
      {
         System.out.println(e.getEid()+" : "+e.getEname()+" : "+e.getSalary()+" : "+e.getMobile());
      }
  }
}
