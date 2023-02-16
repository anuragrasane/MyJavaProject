import java.util.Scanner ;
class OddEven
{	public static void main(String[]args)
	
	{
		Scanner input = new Scanner (System.in) ;
		System.out.println("Enter a int number: ") ;
		int num = input.nextInt();

		if (num%2 == 0) 
			
			{ System.out.println("the given no is Even") ; }
		else 
			{System.out.println("the given no is Odd") ; }
		
	}
}
//import java.util.Scanner ;
//class Scanner1
/*
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in) ;
		System.out.println("Enter a int number: ") ;
		int a = input.nextInt();
		System.out.println("Entered Number is : "+a) ;

	 */