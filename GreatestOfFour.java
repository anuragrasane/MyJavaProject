class GreatestOfFour
{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int result = (b>a)?((b>c)?b:c):((a>c)?a:c) ;
		int result2 =(result > d)?result:d;
		System.out.println(result2 + " is the Greatest Number") ;
	}
}