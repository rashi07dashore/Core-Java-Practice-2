import java.util.Scanner;
class Employee
{
   int eid;
   String ename,mobile;
   float salary;
   
   Employee()
   { }
   Employee(int eid,String ename,String mobile,float salary)
   {
      this.eid = eid;
      this.ename = ename;
      this.mobile = mobile;
      this.salary = salary;
   }
   public int getEid()
   {
       return eid;
   }
   public void setEid(int eid)
   {
       this.eid = eid;
   }
   
   public float getSalary()
   {
       return salary;
   }
   public void setSalary(float salary)
   {
       this.salary = salary;
   }
   
   public String getEname()
   {
       return ename;
   }
   public void setEname(String ename)
   {
       this.ename = ename;
   }
   
   public String getMobile()
   {
       return mobile;
   }
   public void setMobile(String mobile)
   {
       this.mobile = mobile;
   }
   
   public String toString()
   {
      // return eid+" : "+ename+" : "+mobile+" : "+salary;
        return ename;
   }
}
