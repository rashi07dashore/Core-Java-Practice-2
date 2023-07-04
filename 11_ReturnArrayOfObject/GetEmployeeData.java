import java.util.Scanner;
class GetEmployeeData
{ 
    public static Employee[] setEmployee()
   {
        int i,id;
       String name,mobile;
       float salary;
       Scanner sc = new Scanner(System.in);
       Employee emp[] = new Employee[5];
       
       for(i=0;i<emp.length;i++)
       {
           System.out.println("Enter Employee Id,Name,Salary and Mobile");
           id = sc.nextInt();
           name = sc.next();
           salary = sc.nextFloat();
           mobile = sc.next();
           emp[i] = new Employee(id,name,mobile,salary);
       }
       
       return emp;
   }
}
