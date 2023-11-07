package server;

import hotelapp.*;
import org.apache.commons.text.StringEscapeUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class HotelServlet extends HttpServlet {
	// FILL IN CODE
    private HotelReviewData hdata;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    {
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("text/html");
        try {
            String hotelId = request.getParameter("id");
            hotelId = StringEscapeUtils.escapeHtml4(hotelId);

            HotelReviewData hd = (HotelReviewData) getServletContext().getAttribute("hotelReviewData");

            response.getWriter().println("Hotel id:" + hotelId + " " + hd.getReviews(hotelId));
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }

}