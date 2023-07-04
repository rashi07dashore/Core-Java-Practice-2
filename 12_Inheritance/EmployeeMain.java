class Employee
{
    protected int empId;
    protected String empName;
}
class Manager extends Employee
{
    private float ta,da;
    public void setData(int empId,String empName,float ta,float da)
{
                this.empId = empId;
		this.empName = empName;
		this.ta = ta;
		this.da = da;
	}
	public void showData()
	{
		System.out.println(empId+" : "+empName);
		System.out.println(ta+" "+da);
	}
}
class EmployeeMain
{
    public static void main(String args[])
    {
        Manager m = new Manager();
        m.setData(101,"Mahi",123.34f,345.56f);
        m.showData();
    }
}
