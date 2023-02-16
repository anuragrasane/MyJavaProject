import java.util.Scanner ;
class GreatesOfTwo
{
	
	public static void main(String[] args) 
	{
	Scanner input = new Scanner (System.in) ;
	System.out.println("Enter 1st number: ") ;
	int a = input.nextInt();
	System.out.println("Enter 2nd number: ") ;
	int b = input.nextInt();
	if (a>b)
		{System.out.println(a + " is greater");}
	else 
		{ System.out.println(b + " is greater");}
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