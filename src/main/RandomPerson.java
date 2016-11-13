package main;

import java.util.Random;

/**
 * @author krooly
 */

public class RandomPerson 
{
   
   static Person newRandomPerson()
	{
	    Random r = new Random();
		Person person = new Person(	firstNameList[r.nextInt(firstNameList.length-1)],
									lastNameList[r.nextInt(lastNameList.length-1)],
									r.nextInt(15)+20);
		return person;
	}
	
	static final String[] firstNameList = 
		{
			"Alexander",
			"Aleksey",
			"Bob",
			"Boris",
			"Vladimir",
			"Vladislav",
			"Gregogy",
			"Daniil",
			"David",
			"Dmitriy",
			"Evgeniy",
			"Igor",
			"Ivan",
			"Leonard",
			"Mikhail",
			"Mitchal",
			"Nikolay",
			"Oleg",
			"Pavel",
			"Rinat",
			"Sergey",
			"Timofey"
		};
	
	static final String[] lastNameList = 
		{
			"Alexanrov",
			"Bagrov",
			"Bondarev",
			"Vasilev",
			"Galustyan",
			"Dmitriev",
			"Dronov",
			"Efremov",
			"Zhukov",
			"Zimin",
			"Ivanov",
			"Ignatiev",
			"Khalitulin",
			"Kulikov",
			"Mitrofanov",
			"Nikitin",
			"Nikolaev",
			"Suvorov",
			"Frolov"
		};
}
