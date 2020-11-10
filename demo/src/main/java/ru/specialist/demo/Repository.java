package ru.specialist.demo;

import java.util.Hashtable;
import java.util.Map;

public class Repository {
	static Map<String, Person> persons = new Hashtable<>(); 
		
	static {
		persons.put("Андрюха", new Person ("Константин", 14));
		persons.put("Томас", new Person ("Соир", 35));
		persons.put("Аббос", new Person ("Мурод", 44));
		persons.put("Наташа", new Person ("Моника", 50));
	}
	public Person personByName(String name) {
		return persons.get(name);
	}
	public Person addPerson(Person p) {
	persons.put(p.getName(), p);
	return p;
	}
}
