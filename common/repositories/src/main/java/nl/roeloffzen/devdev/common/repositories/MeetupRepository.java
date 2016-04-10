package nl.roeloffzen.devdev.common.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import nl.roeloffzen.devdev.common.entities.Meetup;
import nl.roeloffzen.devdev.common.entities.util.PersistenceUtil;

public class MeetupRepository 
{
	@SuppressWarnings("unchecked")
	public List<Meetup> getAllMeetups()
	{
		EntityManager em = PersistenceUtil.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        List<Meetup> meetups = em.createQuery("FROM Meetup").getResultList();
        transaction.commit();
        return meetups;
	}
}
