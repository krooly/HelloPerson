package main;

/**
 * @author krooly
 */

public class HelloPerson 
{
	public static void main(String[] arg) 
	{
		//hello text
		System.out.println("Hello! This program for write person-data to xml");
		System.out.println("************************************************");
		
		Person dima = new Person("Dmitry","Korzanov",21); 
		
		XMLWriterPerson.writeToSystemOut(dima);
		XMLWriterPerson.writeToXML(dima,false);
		
		for (int i = 0; i < 250; i++) {
			writeToXMLandSystemout(RandomPerson.newRandomPerson());
		}
		
	}
	
	static void writeToXMLandSystemout(Person person)
	{
		XMLWriterPerson.writeToSystemOut(person);
		XMLWriterPerson.writeToXML(person,true);
	}
}
