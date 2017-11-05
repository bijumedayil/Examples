package com.cluster;

import java.util.ArrayList;
import java.util.List;

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Animal
{
	void eating()
	{
		System.out.println("Animal is eating");
	}
}

/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Dog extends Animal
{
	void eating()
	{
		System.out.println("Dog is eating");
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
class Hello{
	// unbounded
	void m1(List<?> list)
	{
		for (Object e:list)
		{
			System.out.println("Inside m1" + e);
		}
	}
	// upper bound
	void m2(List<? extends Animal> list)
	{
		for (Animal e:list)
		{
			System.out.println("Inside m2" + e);
		}
	}
	//lower bound
	void m3(List<? super Dog> list)
	{
		for (Object e:list)
		{
			System.out.println("Inside m3" + e);
		}
	}
}


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class WildCardDemo7 {
	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		strList.add("BBB");
		strList.add("AAA");
		strList.add("DDD");
		
		List<Object> objectList = new ArrayList<Object>();
		objectList.add(20);
		objectList.add(10);
		objectList.add(30);
		
		
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Animal());
		animalList.add(new Animal());
		animalList.add(new Animal());
		
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog());
		dogList.add(new Dog());
		dogList.add(new Dog());
		
		
		System.out.println("Executing m1 Unbounded wildcard*********");
		Hello h1 = new Hello();
		h1.m1(strList);
		h1.m1(objectList);
		h1.m1(animalList);
		h1.m1(dogList);
		
		System.out.println();
		System.out.println("Executing m2 upperbound wildcard*********");
	//	h1.m2(strList); // not in Animal hierarchy
	//	h1.m2(objectList); // super class of Animal
		h1.m2(animalList);
		h1.m2(dogList);
		
		System.out.println();
		System.out.println("Executing m3 lowerbound wildcard*********");
	//	h1.m3(strList); // not in Animal hierarchy
		h1.m3(objectList);
		h1.m3(animalList);
		h1.m3(dogList);
		
		
	}
}
