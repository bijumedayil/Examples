class A
{
	
	static
	{
		System.out.println("Inside A static block");
	}
	
	{
		System.out.println("Inside A instance block");
	}

/*	A()
	{
		System.out.println("Inside A constructor");
	}  */
};

class B extends A
{
	static
	{
		System.out.println("Inside B static block");
	}
	
	{
		System.out.println("Inside B instance block");
	}
	
/*	B()
	{
		super();
		System.out.println("Inside B constructor");
	} */
};

class C extends B
{
	static
	{
		System.out.println("Inside C static block");
	}
	
	{
		System.out.println("Inside C instance block");
	}
/*	C()
	{
		super();
		System.out.println("Inside C constructor");
	} */
};




class InheritanceConstructorDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
	//	A a1 = new A();
	//	A a = new A();
	//	B b = new B();
		C c = new C();
	//	C c1 = new C();
	}
}
