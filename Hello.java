

class Test
{
	Test()
	{
		System.out.println(this);	
	}

}

class Hello extends Test
{
	Hello()
	{
		super();
		System.out.println(this);	
	}
	public static void main(String ...aa){
	Hello h = new Hello();
}

}