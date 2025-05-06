class Rectangle extends Shape implements Printable{
	double wirdth;
	double heigth;

	Rectangle(double wirdth,double heigth)
	{
		this.wirdth=wirdth;
		this.heigth=heigth;
	}
	
	public double area()
	{
		return wirdth*heigth;
	}

	public void print()
	{
		System.out.println("Printing...");
	}
	
}