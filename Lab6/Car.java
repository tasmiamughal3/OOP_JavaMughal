class Car extends Vehicle{
	int numDoor;



	Car(String brand,String speed,int numDoor){
		super(brand,speed);
		this.numDoor=numDoor;
	}

	void showDetails(){
		super.showDetails();
		System.out.print("Num Door:"+numDoor);
	}
}