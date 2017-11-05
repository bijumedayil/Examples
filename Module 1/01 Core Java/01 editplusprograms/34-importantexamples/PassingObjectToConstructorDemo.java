class A
{
	int i;
	A(int x)
	{
		i = x;
	}
}

class B
{
	int j;
	B(A oba)
	{
		j = oba.i;
	}
}
class C
{
	int k;
	C(B obb)
	{
		k = obb.j;
	}
}



class PassingObjectToConstructorDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	/*	A a = new A(10);
		B b = new B(a);
		C c = new C(b);*/
		C c = new C(new B(new A(10)));
		System.out.println("Value of k is " + c.k);


	}
}
