class DemoMain
{
    public static void main(String args[])
    {
        Employee e[] = GetEmployeeData.setEmployee();
        ShowEmployeeData.showEmployee(e) ; 
         //passsing argument array of object
    }
}
