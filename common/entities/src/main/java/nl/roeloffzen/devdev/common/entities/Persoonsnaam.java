package nl.roeloffzen.devdev.common.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Persoonsnaam 
{
	public static Persoonsnaam of(String roepnaam, String achternaam)
	{
		return new Persoonsnaam(roepnaam, null, achternaam);
	}
	
	public static Persoonsnaam of(String roepnaam, String tussenvoegsel, String achternaam)
	{
		return new Persoonsnaam(roepnaam, tussenvoegsel, achternaam);
	}
	
	@Column
	private String roepnaam;
	
	@Column
	private String tussenvoegsel;
	
	@Column
	private String achternaam;
	
	protected Persoonsnaam()
	{}
	
	Persoonsnaam(String roepnaam, String tussenvoegsel, String achternaam)
	{
		this.roepnaam = roepnaam;
		this.tussenvoegsel = tussenvoegsel;
		this.achternaam = achternaam;
		
	}

	public String getRoepnaam() {
		return roepnaam;
	}

	public String getTussenvoegsel() {
		return tussenvoegsel;
	}

	public String getAchternaam() {
		return achternaam;
	}
}
