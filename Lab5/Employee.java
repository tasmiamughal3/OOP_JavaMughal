class Employee{
 String name;
 String empID;
 int Salary;

 Employee(String name,String empID, int Salary)
 {
   this.name=name;
   this.empID=empID;
   this.Salary=Salary; 
 }
 void increaseSalary(int amount){
  Salary+=amount;
 }
 
 double AnnualSalary() 
 {
    return Salary*12;
 }

 void dispalyDetail()
 {
   System.out.println("Employee's name :"+name);
   System.out.println("Employees ID"+empID);
   System.out.println("Salary :"+Salary);
 }

public static void main(String[]args){
Employee e1=new Employee("Haider Khan", "ARI200",50);
e1.increaseSalary(10);
e1.dispalyDetail();
System.out.println("Annual Salary:"+e1.AnnualSalary());

} 
}