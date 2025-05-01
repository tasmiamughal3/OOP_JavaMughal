import java.util.Scanner;
class Lab7{
	/*
	//Task NO:01
	public static void main(String []args){
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the String ");
		String check=input.nextLine();

		if(check.isEmpty())
		{
			System.out.println("String is Empty");
		}
		else
		{
			System.out.println("String is not Empty");
		}
	}
	
	//Task No:02

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String check = input.nextLine();
        int index = check.indexOf("a");
        System.out.println("Index of first 'a': " + index);    
    }
   

    //Task NO:03

    public static void main(String [] args)
    {
    	Scanner input =new Scanner(System.in);

    	System.out.println("Enter the names ");
    	String[] Array=new String[5];

    	for(int i=0;i<Array.length;i++)
    	{
    		Array[i]=input.nextLine();
    	}

    	System.out.println("Upper case");
    	for(int i=0;i<Array.length;i++)
    	{
    		System.out.println(Array[i].toUpperCase());
    	}
    }


	//Task NO:04

	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the String");
		String name=input.nextLine();

		if(name.startsWith("Hello"))
		{
			Sytem.out.println("String Start with Hello");
		}
		else
		{
			System.out.println("String not start with Hello");
		}
	}

	//Task NO:05

	public static void main(String []args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=input.nextLine();

		if(name.endsWith("World"))
		{
			System.out.println("String Start with World");
		}
		else
		{
			System.out.println("String not start with World");
		}
	}
	

	//Task NO:06
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=input.nextLine();

		if(name.contains("Java"))
		{
			System.out.println("String contain with Java");
		}
		else
		{
			System.out.println("String does contain not Java");
		}
	}

	*/
	//Task No:07
	public static void main(String []args){
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the String");
		String remove=input.nextLine();

		String modified=remove.replace(" ","");
		System.out.println("Replaced and modified :"+modified);
	}
	
	//Task 8

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any letter ..");
		String letter = input.nextLine();
		String[] arr= letter.split(" ");

		int count =0;
		for(String word :arr){
           System.out.println(word);
           count++;
		}
        System.out.println("Number of words : "+count);


	}

}