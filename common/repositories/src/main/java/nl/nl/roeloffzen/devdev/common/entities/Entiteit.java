package nl.roeloffzen.devdev.common.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Entiteit 
{
	@Id
	@GeneratedValue
	@Column(nullable = false, name = "id")
	private Long id;
	
	@Column(nullable = false, name = "version")
	private Long version;
	
	protected Entiteit()
	{}
	
	public Long getId()
	{
		return id;
	}
	
	public Long getVersion()
	{
		return version;
	}
}
