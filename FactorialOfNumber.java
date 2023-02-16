import java.util.Scanner ;
class FactorialOfNumber
{
	static int factorial(int a) 
	{
		if(a>1)
		{
			return a * factorial(a - 1) ;
		}
		else
		{
			return 1 ;
		}
	}
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in) ;
		System.out.println("Enter number: ") ;
		int a = input.nextInt();
		System.out.println("Factorial of Given Number is " +factorial(a));
	}
}

//class Scanner1
/*
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		System.out.println("Enter a int number: ") ;
		int a = input.nextInt();
		System.out.println("Entered Number is : "+a) ;

	 */