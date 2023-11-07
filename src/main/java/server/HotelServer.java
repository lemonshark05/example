package server;

import hotelapp.HotelReviewData;
import hotelapp.Review;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import  org.eclipse.jetty.servlet.ServletContextHandler;

import java.io.IOException;

public class HotelServer {
	public static final int PORT = 8080;

	public static void main(String[] args)   {
		Server server = new Server(PORT);
		HotelReviewData hdata = new HotelReviewData();
		hdata.addReview("10323", new Review("562vb4", "10323",
				"Good", "Phil", 5));
		hdata.addReview("10323", new Review("12gy74", "10323",
		"It's pretty good", "Deepika", 4));

		ServletContextHandler handler = new ServletContextHandler(ServletContextHandler.SESSIONS);
		handler.addServlet(HotelServlet.class, "/hotels");
		handler.setAttribute("hotelReviewData", hdata);
		server.setHandler(handler);
		try {
			server.start();
			server.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}