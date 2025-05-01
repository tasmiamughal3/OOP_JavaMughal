class GraduateStudent extends Student{
	String researchTopic;

	GraduateStudent(String name,int age,String studentID,String researchTopic)
	{
	super(name,age,studentID);
		this.researchTopic=researchTopic;
	}

	void displayInfo()
	{  super.displayInfo();
		System.out.println("Students reachers topic"+researchTopic);
	}
}