package nl.roeloffzen.devdev.common.rest.contract.model;

import java.util.Date;

public class RMeetup 
{
	private String naam;
	
	private Date datum;
	
	public RMeetup(String naam, Date datum)
	{
		this.naam = naam;
		this.datum = datum;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}
}
