class Employee{

	double calculateBonus(int Salary)
	{
		return ((10)*(Salary))/100;
	}

	double calculateBonus(int Salary,int extraHours)
	{
		return ((10)*(Salary))/100+(extraHours*500);
	}

	public static void main(String []args){
		Employee emp=new Employee();
		System.out.println(emp.calculateBonus(50000));
		System.out.println(emp.calculateBonus(50000, 3));
	}
} 