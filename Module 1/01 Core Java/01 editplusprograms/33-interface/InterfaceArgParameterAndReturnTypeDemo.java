interface Animal
{
	void sound();
	void eat();
}
class Lion implements Animal
{
	public void sound()
	{
		System.out.println("Lion is roaring");
	}
	public void eat()
	{
		System.out.println("Lion is eating");
	}
}
class Dog implements Animal
{
	public void sound()
	{
		System.out.println("Dog is barking");
	}
	public void eat()
	{
		System.out.println("Dog is eating");
	}
}

class Cat implements Animal
{
	public void sound()
	{
		System.out.println("Cat says meow");
	}
	public void eat()
	{
		System.out.println("Cat is eating");
	}
}

class Hello
{
	void m1(Animal z)
	{
		System.out.println("Begin of m1");
		System.out.println("Value of z++++++++ " + z);
		if (z instanceof Lion)
		{
			System.out.println("Begin of LION*********");
			Lion l = (Lion)z;
			l.sound();
			l.eat();
		}
		else if (z instanceof Dog)
		{
			System.out.println("Begin of DOG*********");
			Dog d = (Dog)z;
			d.sound();
			d.eat();
		}
		else if (z instanceof Cat)
		{
			System.out.println("Begin of CAT*********");
			Cat c = (Cat)z;
			c.sound();
			c.eat();
		}
	/*	System.out.println("Begin of m1");
		System.out.println("Value of z++++++++ " + z);
		z.sound();
		z.eat();*/
		System.out.println("End of m1");
	}
	Animal m2()
	{
		Animal z = new Cat();
		System.out.println("Val of a++++++ in m2 is " + z);
		return z;

	}
};


class InterfaceArgParameterAndReturnTypeDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h = new Hello();
		Animal a = null;
		System.out.println("Value of a++++++++ " + a);
	/*	a = new Cat();
		System.out.println("Value of a++++++++ " + a);
		h.m1(a);*/
		a = h.m2();
		System.out.println("Value of a++++++++ " + a);
		a.sound();
		a.eat();
		System.out.println("End of main");

		

	}
}
