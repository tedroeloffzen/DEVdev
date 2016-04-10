package nl.roeloffzen.devdev.common.entities;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Persoon extends Entiteit
{
	@NotNull
	@Embedded
	private Persoonsnaam naam;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persoon")
	private List<MeetupPersoon> meetups;
	
	public Persoon()
	{}
	
	public Persoonsnaam getNaam()
	{
		return naam;
	}
}
