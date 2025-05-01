class Student{
	private String name;
	private int rollnumber;
	private char grade;

	void setname(String name)
	{
		this.name=name;
	}

	String getname()
	{
		return name;
	}

	void setrollnumber(int rollnumber)
	{
		this.rollnumber=rollnumber;
	}

	int getrollnumber()
	{
		return rollnumber;
	}

	void setgrade(char grade)
	{
		this.grade=grade;
	}

	double getgrade()
	{
		return grade;
	}

	void  displayDetails()
	{
		System.out.println("Student's Name: "+name);
		System.out.println("Student's Rollnumber"+rollnumber);
		System.out.println("Student's Grades: "+grade);
	}

	public static void main(String []args){
		Student s=new Student();

		s.setname("leeza");
		s.setrollnumber(11);
		s.setgrade('A');
		s.displayDetails();
	}
}
