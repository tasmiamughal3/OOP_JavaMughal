class Duck implements Flyable,Swimmable{

	public void fly(){
		System.out.println("Duck flying");
	}

	public void swim(){
		System.out.println("Duck Swiming ");
	}


	public static void main(String[] args) {
		Duck d=new Duck();

		d.fly();
		d.swim();
	}
}