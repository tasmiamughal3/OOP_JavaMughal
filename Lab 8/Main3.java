class Main3{
	public static void main(String []args){
		Bank sbi=new SBI();
		Bank icici=new ICICI();
		Bank hdfc=new HDFC();

		System.out.println("SBI Interest: " + sbi.getInterestRate());  
        System.out.println("ICICI Interest: " + icici.getInterestRate()); 
	}
}