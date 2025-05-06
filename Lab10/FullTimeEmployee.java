class FullTimeEmployee extends  Employee implements TaxPayer {
	double monthlySalary;

	public FullTimeEmployee(String name,int id,double monthlySalary)
	{
		super(name,id);
		this.monthlySalary=monthlySalary;
	}
	public double calculateSalary()
	{
		return monthlySalary;
	} 

	public void payTax()
	{
		double tax =0.2*monthlySalary;
		System.out.print(name);
		System.out.println(" Full Tax:"+tax);
	}
}