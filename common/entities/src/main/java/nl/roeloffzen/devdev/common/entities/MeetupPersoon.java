package nl.roeloffzen.devdev.common.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MeetupPersoon extends Entiteit 
{
	public static MeetupPersoon of(Persoon persoon, Meetup meetup)
	{
		return new MeetupPersoon(persoon, meetup);
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private Persoon persoon;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Meetup meetup;
	
	@Column(nullable = false)
	private boolean aanwezig;
	
	protected MeetupPersoon()
	{}
	
	MeetupPersoon(Persoon persoon, Meetup meetup)
	{
		this.persoon = persoon;
		this.meetup = meetup;
		aanwezig = false;
	}
	
	public Persoon getPersoon() {
		return persoon;
	}

	public Meetup getMeetup() {
		return meetup;
	}

	public boolean isAanwezig() {
		return aanwezig;
	}
	
	public void setAanwezig(boolean aanwezig)
	{
		this.aanwezig = aanwezig;
	}
}
