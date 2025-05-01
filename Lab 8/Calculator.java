class Calculator{

	int add(int a,int b)
	{
		return a+b;
	}

	double add(double a,double b)
	{
		return a+b;
	}

	 String add(String a,String b)
	 {
	 	return a+b;
	 }


	 public static void main(String []args){
	 	Calculator c=new Calculator();

	 	System.out.println(c.add(56,76));
	 	System.out.println( c.add(34.0,45.0));
	 	System.out.println(c.add("hello","world"));
	 }
}