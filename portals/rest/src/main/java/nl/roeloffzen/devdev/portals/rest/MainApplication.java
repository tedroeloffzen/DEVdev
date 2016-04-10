package nl.roeloffzen.devdev.portals.rest;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
import org.jboss.resteasy.plugins.server.servlet.ResteasyBootstrap;

public class MainApplication
{
	public static void main(String[] args) throws Exception
	{
		 Server server = new Server(9090);
		 ServletContextHandler servletHandler = new ServletContextHandler();
		 ResteasyBootstrap resteasyBootstrap = new ResteasyBootstrap();
		 servletHandler.addEventListener(resteasyBootstrap);
		
		 ServletHolder sh = new ServletHolder(HttpServletDispatcher.class);
		 sh.setInitParameter("javax.ws.rs.Application", "nl.roeloffzen.devdev.portals.rest.RESTApplication");
		 servletHandler.addServlet(sh, "/*");

	     server.setHandler(servletHandler);
	     server.start();
	     server.join();  
	}
}
