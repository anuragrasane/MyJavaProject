class ConditionalOperator
{
	public static void main(String[] args) {
		int a = 100 ;
		int b = 11 ;
		int result1 = (a>b)? a:b ;
		System.out.println(result1 + "is Greater Number") ;

		//Method 2
		String result2 = (a>b)? a + "is Greater Number" : b + "is Greater Number" ;
		System.out.println(result2) ;
	}
}