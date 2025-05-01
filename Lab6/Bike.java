class Bike extends Vehicle{
	String helmetType;



	Bike(String brand,String speed,String helmetType){
		super(brand,speed);
		this.helmetType=helmetType;
	}

	void showDetails(){
		super.showDetails();
		System.out.print("Type of helmet :"+helmetType);
	}
}