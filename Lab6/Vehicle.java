class Vehicle{
	String brand;
	String speed;

	Vehicle(String brand,String speed)
	{
		this.brand=brand;
		this.speed=speed;
	}

	void showDetails(){
		System.out.println("Vehicle's brand :"+brand);
		System.out.println("Vehicle's Speed :"+speed);
	}
}