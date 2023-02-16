class DatatypeRange
{
	public static void main(String[]args)
	{
	byte a = -128;
	byte b = +127;
	short c =-32768;
	short d =+32767;
	int f = -2147483648 ;
	int g = +2147483647 ;
	long h = -9223372036854775808L;
	long i = +9223372036854775807L ;
	//long d = 4 ;
	//System.out.println(a);
	System.out.println( " byteRange = " + a + " to " + b );
	System.out.println( " shortRange = " + c + " to " + d );
	System.out.println( " intRange = " + f + " to " + g );
	System.out.println( " longRange = " + h + " to " + i );
	//System.out.println(c);
	//System.out.println(d);
	}
} 