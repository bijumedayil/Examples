interface A
{
	void m1();
	void m2();
}
interface B 
{
	void m3();
	void m4();
}

class Z implements A,B
{
	public void m1()
	{
		System.out.println("Inside Z m1");
	}
	public void m2()
	{
		System.out.println("Inside Z m2");
	}

	public void m3()
	{
		System.out.println("Inside Z m3");
	}
	public void m4()
	{
		System.out.println("Inside Z m4");
	}
	void fun()
	{
		System.out.println("Inside Z fun");
	}


};


class MultipleInheritanceDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
	//	z = new Z();
	/*	z.m1();
		z.m2();
		z.m3();
		z.m4();
		z.fun();*/
//		a = z; // Implicit casting
//		z = (Z)a;// Explicit casting
//		a.m1();
//		a.m2();
//		a.m3();
//		a.m4();
//		a.fun();
//		b = z;
//		b.m1();
//		b.m2();
//		b.m3();
//		b.m4();
//		b.fun();
		A a = null;
		B b = null;
		Z z = null;
		 a = new Z(); // Implicit , Up casting 
//		a.m1();
//		a.m2();
	//	z = a; // Error giving bigger value to smaller data type
		b = (B)a; // Explicit casting (casting interface data type)
	//	z.m1();		// down casting
	//	z.m2();
		b.m3();
		b.m4();
	//	z.fun(); 

		
	}
}
