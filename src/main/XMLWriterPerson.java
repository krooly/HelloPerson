package main;

/**
 * @author krooly
 */

import java.io.*;

public class XMLWriterPerson 
{
	static void writeToXML(Person person, boolean append)
	{
		try (FileWriter xmlWriter = new FileWriter("C:\\Users\\Public\\Documents\\persons.xml",append))
		{
		String text = xmlPerson(person);
		xmlWriter.write(text);
		xmlWriter.append('\n');
		xmlWriter.flush();
		}
		catch (IOException ex)
		{
           System.out.println(ex.getMessage());
		}
	}
	
	static void writeToSystemOut(Person person)
	{
		System.out.println(xmlPerson(person));
	}
	
	static String xmlPerson(Person person)
	{
		return
				"<person>" + "\n" +
				"    <firstname>" +  "\n" +
				"        " + person.getFirstName() + "\n" +
				"    </firstname>" + "\n" +
				"    <lastname>" + "\n" +
				"        " + person.getLastName() + "\n" +
				"    </lastname>" + "\n" +
				"    <age>" + "\n" +
				"        " + person.getAge() + "\n" +
				"    </age>" + "\n" +
				"</person>";
	}
	
}
