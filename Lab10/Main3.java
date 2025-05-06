class Main3{
	public static void main(String[] args) {
		 FullTimeEmployee fte = new FullTimeEmployee("rubab", 902, 60000);
        PartimeEmployee pte = new PartimeEmployee("kainat", 301, 10, 90);

         System.out.println("Salary of " + fte.name + ": $" + fte.calculateSalary());
         fte.payTax();

         System.out.println("Salary of " + pte.name + ":" + pte.calculateSalary());
         pte.payTax();


	}
}