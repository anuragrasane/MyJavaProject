class LocalVariables
{
	public static void main(String[]args)
	{
		int b = 10;
		{
			b =21;
			System.out.println(b);
		}
		b = 31;
		System.out.println(b);
	}
}