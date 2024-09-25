

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ReminderServlet")
public class ReminderServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Fetching form data
        String day = request.getParameter("day");
        String time = request.getParameter("time");
        String activity = request.getParameter("activity");

        // Print confirmation page
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Reminder Set!</h1>");
        out.println("<p>You have set a reminder for <b>" + activity + "</b> on <b>" + day + "</b> at <b>" + time + "</b>.</p>");
        out.println("<p>The app will notify you at the scheduled time.</p>");
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
