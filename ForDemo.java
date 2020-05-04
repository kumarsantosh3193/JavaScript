

abstract class Test
{

public void print()
{
System.out.println("Dummy Impl");
}

}
class ForDemo extends Test
{

public void print()
{
System.out.println("sahi Impl");
}
	public static void main(String ...args)
	{
		ForDemo f  = new ForDemo();
		f.print();	
	}

} 