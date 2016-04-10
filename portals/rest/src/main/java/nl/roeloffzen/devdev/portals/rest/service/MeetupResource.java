package nl.roeloffzen.devdev.portals.rest.service;

import static java.util.stream.Collectors.toList;

import java.util.Calendar;
import java.util.List;

import javax.ws.rs.core.Response;

import nl.roeloffzen.devdev.common.entities.Meetup;
import nl.roeloffzen.devdev.common.repositories.MeetupRepository;
import nl.roeloffzen.devdev.common.rest.contract.model.RMeetup;
import nl.roeloffzen.devdev.common.rest.contract.service.MeetupService;

public class MeetupResource implements MeetupService 
{
	@Override
	public List<RMeetup> getMeetups() 
	{
		List<Meetup> meetups = new MeetupRepository().getAllMeetups();
		return meetups.stream().map(this::createRMeetup).collect(toList());
	}

	@Override
	public RMeetup getMeetup(Long meetupId) 
	{
		return new RMeetup("Blaat", Calendar.getInstance().getTime());
	}

	@Override
	public Response updateMeeup(RMeetup meetup) 
	{
		return Response.accepted().status(200).build();
	}

	@Override
	public Response saveMeeup(RMeetup meetup) 
	{
		return Response.accepted().status(200).build();
	}
	
	private RMeetup createRMeetup(Meetup meetup)
	{
		return new RMeetup(meetup.getNaam(), meetup.getDatum());
	}
}
