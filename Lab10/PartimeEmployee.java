class  PartimeEmployee extends Employee implements TaxPayer{
	double hourlyRate;
	int hourWorked;

	public PartimeEmployee(String name,int id,double hourlyRate,int hourWorked)
	{
		super(name,id);
		this.hourlyRate=hourlyRate;
		this.hourWorked=hourWorked;
	}

	public double calculateSalary()
	{
		return hourlyRate=hourlyRate;
	}

	public void payTax()
	{
		double salary=calculateSalary();
		double tax=0.1*salary;
		System.out.print(name);
		System.out.println("Full Tax:"+tax);
	}
}