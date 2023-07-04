class ShowEmployeeData
{
   public static void showEmployee(Employee emp[])
  {
      System.out.println("Id : Name : Salary : Mobile");
      for(Employee e : emp)
      {
         System.out.println(e.getEid()+" : "+e.getEname()+" : "+e.getSalary()+" : "+e.getMobile());
      }
  }
}
