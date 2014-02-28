package demo;

import com.google.common.base.Objects;

public class Person
{
	private final String name;
	private final String email;

	private Person(String name, String email)
	{
		this.name = name;
		this.email = email;
	}

	public static Person of(String name, String email)
	{
		return new Person( name, email );
	}

	@Override
	public int hashCode()
	{
		return Objects.hashCode( name, email );
	}

	@Override
	public boolean equals(Object other)
	{
		if( other instanceof Person )
		{
			Person otherPerson = ( Person )other;
			return Objects.equal( name, otherPerson.name )
					&&Objects.equal( email, otherPerson.email );
		}
		return false;
	}
}
