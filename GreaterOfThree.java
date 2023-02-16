import java.util.Scanner;
class GreaterOfThree
{
	public static void main(String[] args) {
		System.out.println("This is the Program to Find the Greatest Number of Three Numbers ") ;
		System.out.println("here we are using\nres1=(a>b)?a:b\n res2=(res1>c)? res1:c \nsuch type of conditional statement ") ;
		Scanner input = new Scanner(System.in) ;
		System.out.println("Input 1st Number") ;
		int a = input.nextInt();
		System.out.println("Input 2nd Number") ;
		int b = input.nextInt();
		System.out.println("Input 3rd Number") ;
		int c = input.nextInt();
		int res1=(a>b)?a:b;
		int res2=(res1>c)? res1:c ;
		System.out.println("Congradulations You Did a Great Job \n From the Above Inputs " +res2 + " is the Greatest Number") ;
		//method 2
        Scanner input2 = new Scanner(System.in) ;
        System.out.println("lets try with another method Once Again\nthis time we will use\nresult = (d>e)?((d>f)?d:f):((e>f)?e:f) \nsuch type of condition") ;
        System.out.println("Input 1st Number") ;
        int d = input2.nextInt();
		System.out.println("Input 2nd Number") ;
        int e = input2.nextInt();
        System.out.println("Input 3rd Number") ;
        int f = input2.nextInt();
		int result = (d>e)?((d>f)?d:f):((e>f)?e:f) ;
		System.out.println(result +" is the Greatest number with method 2") ;
	}
}