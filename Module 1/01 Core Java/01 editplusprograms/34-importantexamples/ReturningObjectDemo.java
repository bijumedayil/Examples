class A
{
	void funa()
	{
		System.out.println("inside fun A");
		int x = 5;
	//	return x;
	}
}

class B
{
	A funb()
	{
		System.out.println("inside fun B");
		A a = new A();
		return a;
	}
}

class C
{
	B func()
	{
		System.out.println("inside fun C");
		B b = new B();
		return b;
	}
}




class ReturningObjectDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
/*		C c = new C();
		B b = c.func();
		A a = b.funb();
		int p = a.funa();*/
//		System.out.println("Val of p is " + p);
//		new C().func().funb().funa();
//		B b = new C().func();
		C c = new C();
	//	System.out.println("Val of p is " + p);

	}
}
