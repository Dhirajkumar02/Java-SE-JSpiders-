package org;

public class CountryMainClass {
	public static void main(String[] args) {
		Country c1 =new Country("India", 140);
		Country c2 =new Country("USA", 45);
		System.out.println(c1.name+" has a population of "+c1.population+" crores.");
		System.out.println(c2.name+" has a population of "+c2.population+" crores.");
	}

}
