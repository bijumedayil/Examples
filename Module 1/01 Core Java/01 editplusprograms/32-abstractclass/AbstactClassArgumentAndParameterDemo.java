abstract class Animal
{
	void eat()
	{
		System.out.println("Dog is eating");
	}
	static abstract void sound();
};

/*class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dog is barking");
	}

};
class Lion extends Animal
{
	void sound()
	{
		System.out.println("Lion is roaring");
	}
}


class Hello
{
	void m1(final Animal z)
	{
		System.out.println("Val of z is "+ z);
//		z = null;
		z.eat();
		z.sound();
		
	}
	Animal m2()
	{
		Animal a = new Dog();
		System.out.println("Val of a is "+ a);
		return a;
	}
};
class Box
{
};


class AbstactClassArgumentAndParameterDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Hello h = new Hello();
//		Box b = null;
//		Animal a = new Lion();
//		Dog d = new Dog();
//		h.m1(d);
		Animal p = h.m2();
	System.out.println("Val of p is "+ p);
	p.eat();
	p.sound();
	}
} */
