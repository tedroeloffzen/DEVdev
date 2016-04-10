package nl.roeloffzen.devdev.common.repositories;

public class PersoonRepository 
{
	private static PersoonRepository repo;
	static
	{
		repo = new PersoonRepository();
	}
	
	public static PersoonRepository instance()
	{
		return repo;
	}
	
	private PersoonRepository()
	{
		
	}
}
