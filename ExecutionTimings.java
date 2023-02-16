class ExecutionTimings
{
	
	
	static 
	{
			System.out.println("Static Initializers");
	}

		{
			System.out.println("Non Static Initializers");
		}
		ExecutionTimings()
		{
			System.out.println("Constructor Executed");
		}
	public static void main(String[] args) 
	{
			System.out.println("Main Method Starts");
			ExecutionTimings c1 = new ExecutionTimings() ;
			System.out.println("Main Ends") ;
	}
	
}