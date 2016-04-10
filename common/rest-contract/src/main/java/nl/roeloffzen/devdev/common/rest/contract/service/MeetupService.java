package nl.roeloffzen.devdev.common.rest.contract.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;

import nl.roeloffzen.devdev.common.rest.contract.model.RMeetup;

@Path("/")
@Produces("application/json")
@Consumes("application/json")
public interface MeetupService 
{
	@GET
	@Path("/meetups")
	public List<RMeetup> getMeetups();
	
	@GET
	@Path("/meetups/{meetupid}")
	public RMeetup getMeetup(Long meetupId);
	
	@PUT
	@Path("/meetups/{meetupid}")
	public Response updateMeeup(RMeetup meetup);
	
	@POST
	@Path("/meetups")
	public Response saveMeeup(RMeetup meetup);	
}
