import java.util.Scanner ;
class LeapYear
{
	public static void main(String[] args) 
	{
	Scanner input = new Scanner (System.in) ;
	System.out.println("Enter year: ") ;
		int year = input.nextInt();
	 if (year%4 == 0)
	  	{
			if (year%400 ==0)
				{
					System.out.println("It is Century Leap Year");
				}
			else 
				{
					System.out.println("It is Not a Century Leap Year ");
				}
		}		
	 else 
	 	{
			System.out.println("Not a Leap Year ");
		}
	  	
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