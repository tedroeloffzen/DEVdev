package nl.roeloffzen.devdev.portals.rest;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import nl.roeloffzen.devdev.portals.rest.service.MeetupResource;

@ApplicationPath("/api")
public class RESTApplication extends Application 
{

	@Override
	public Set<Class<?>> getClasses() 
	{
		return Collections.singleton(MeetupResource.class);
	}
}
