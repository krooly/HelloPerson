/**
 * @author krooly
 */

package main;

public class Person 
{
	private String firstName;
	private String lastName;
	private Integer age;
//	private String phone;
//	private String address;
		
	public Person (String firstName, String lastName, Integer age) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public Integer getAge()
	{
		return age;
	}
}
