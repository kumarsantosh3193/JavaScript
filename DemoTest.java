
class DemoTest
{
	private int i=10;
	static long l = 50L;
	
	public void test()
	{
		System.out.println("test method===");
	}

	{
		System.out.println("simple initialization block==="+i);
	}

	static{
		System.out.println("static initialization block==="+l);
	}
	DemoTest()
	{
		System.out.println("Constructor called===");
	}

	public static void main(String ... args)
	{
		DemoTest t =new DemoTest();
		t.test();
	}

}