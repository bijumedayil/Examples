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
//	Animal a = new Lion(); // dynamic polymorphism
	Dog d = new Dog(); // access sub class member
	void m1()
	{
		d.eat();
		d.sound();
//		d.fun();
	}
};

class InterfaceInstanceVariableDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Hello h  = new Hello();
		h.m1();
	}
}
