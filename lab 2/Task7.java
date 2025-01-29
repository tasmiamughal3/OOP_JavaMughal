class Task7{
	public static void main(String[]args){
int	arr[]={2,4,1,3,7};
	
	
	int max=arr[0] ,low=arr[0];
	
	for (int i=0;i<5;i++)
	
	{
		if (max<arr[i])
		{
			
		max=arr[i];
		}
		}
		if (max%2==0)
		{
			System.out.println("Maximum num of:"+max);
			System.out.println("Maximu number is able to division  with 2");
			
		}
		else
		{
		System.out.println("Maximum num of:"+max);
			System.out.println("Maximu number isnot able to division  with 2");}
		for (int i=0;i<5;i++)
	
	{
		if (low>arr[i])
		{
			
		low=arr[i];
		}
		
		
		
		}
	System.out.print("Lowest number is:"+low);
	
	
}}