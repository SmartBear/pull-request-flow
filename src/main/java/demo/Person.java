package demo;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

import java.util.Optional;

import static com.google.common.base.Preconditions.checkNotNull;

public class Person
{
	private final String name;
	private final Optional<String> email;
	private final Object betterName;

	private Person(String name, String email)
	{
		this.name = checkNotNull( name );
		this.email = Optional.ofNullable( email );
	}

	public static Person of(String name, String email)
	{
		return new Person( name, email );
	}

	public String getName()
	{
		// TODO: wat
		return name;
	}

	public Optional<String> getEmail()
	{
		return email;
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
