package nl.roeloffzen.devdev.common.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Meetup extends Entiteit 
{
	@Column(nullable = false)
	private String naam;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date datum;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "meetup")
	List<MeetupPersoon> gekoppeldePersonen;
	
	protected Meetup()
	{}
	
	public Meetup(String naam, Date datum)
	{
		this.naam = naam;
		this.datum = datum;
	}
	
	public String getNaam()
	{
		return naam;
	}
	
	public Date getDatum()
	{
		return datum;
	}
	
	public void addPersoon(Persoon persoon)
	{
		MeetupPersoon mp = MeetupPersoon.of(persoon, this);
		getGekoppeldePersonen().add(mp);
	}
	
	protected List<MeetupPersoon> getGekoppeldePersonen()
	{
		return gekoppeldePersonen;
	}
}
