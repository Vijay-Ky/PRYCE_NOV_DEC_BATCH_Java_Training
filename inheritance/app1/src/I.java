class I
{
	I()
	{
		System.out.println("I()");
	}
}
class J extends I
{
	J()
	{
		this(19, 2);
		System.out.println("J()");
	}
	J(int j, int i)
	{
		super();
		System.out.println("J(int, int)");
	}
}
class K
{
	public static void main(String[]args)
	{
		//I obj1= new I();
		//System.out.println("-------");
		J obj2 = new J();
		System.out.println("-------");
	}
}