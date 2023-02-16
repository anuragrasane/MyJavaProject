class TypeCasting
{
	public static void main(String[] args) {
		int a = (int)100.109;
		System.out.println(a);


		double b = 100.99 ;
		int c =(int)b;
		System.out.println(c);

		double d =10.9;
		double e = 100.1;
		int i = (int)(d+e) ;
		System.out.println(i) ;
	}
}